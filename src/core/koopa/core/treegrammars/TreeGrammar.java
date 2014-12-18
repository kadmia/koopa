package koopa.core.treegrammars;

import java.util.ArrayList;
import java.util.List;

import koopa.core.data.Data;
import koopa.core.data.Token;
import koopa.core.data.markers.Start;
import koopa.core.grammars.Block;
import koopa.core.treeparsers.FutureTreeParser;
import koopa.core.treeparsers.TreeParser;
import koopa.core.treeparsers.TreeStream;

import org.apache.log4j.Logger;

// TODO Much of this is Copy/Paste of code in KoopaGrammar.
public class TreeGrammar {

	protected static final Logger LOGGER = Logger.getLogger("treegrammar");

	protected final ParsingContext scope = new ParsingContext();

	public TreeParser token(final String text) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				while (true) {
					Token token = stream.forward(Token.class);

					if (token == null) {
						if (LOGGER.isTraceEnabled())
							trace(text + " =~ <END OF (SUB)TREE> : no");
						return false;
					}

					if (text.equalsIgnoreCase(token.getText())) {
						if (LOGGER.isTraceEnabled())
							trace(text + " =~ " + token + " : yes");

						// assignIfNeeded(stream.getTree());
						scope.assignLValue(stream.getTree());

						return true;
					}

					if (LOGGER.isTraceEnabled())
						trace(text + " =~ " + token + " : no; skipping");
				}
			}
		};
	}

	public FutureTreeParser scoped(final String name) {
		return new FutureTreeParser() {
			public boolean accepts(TreeStream stream) {
				while (true) {
					Start start = stream.forward(Start.class);

					if (start == null) {
						if (LOGGER.isTraceEnabled())
							trace("<" + name + "> is <END OF (SUB)TREE> : no");
						return false;
					}

					if (name.equalsIgnoreCase(start.getName())) {
						if (LOGGER.isTraceEnabled())
							push("<" + name + "> is " + start + " : ...");

						if (parser == null)
							return true;

						TreeStream substream = stream.forSubtree();

						scope.enter(name);
						// By default a grammar rule returns the root of the
						// subtree matching it.
						scope.setReturnValue(stream.getTree());

						final boolean accepts = parser.accepts(substream);

						if (LOGGER.isTraceEnabled())
							pop("<" + name + "> is " + start + " : "
									+ (accepts ? "yes" : "no"));

						if (accepts)
							substream.commitSubtree();
						else
							substream.rewindSubtree();

						scope.leave(name);

						return accepts;
					}

					if (LOGGER.isTraceEnabled())
						trace("<" + name + "> is " + start + " : no; skipping");
				}
			}
		};
	}

	public TreeParser optional(final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[optional>");

				stream.bookmark();

				boolean accepts = parser.accepts(stream);

				if (accepts)
					stream.commit();
				else
					stream.rewind();

				if (LOGGER.isTraceEnabled())
					pop("<optional]: " + accepts);

				return true;
			}
		};
	}

	public TreeParser sequence(final TreeParser... parsers) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				for (TreeParser parser : parsers)
					if (!parser.accepts(stream))
						return false;

				return true;
			}
		};
	};

	public TreeParser choice(final TreeParser... parsers) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				// if (LOGGER.isTraceEnabled()) {
				// push("[choice>");
				// }

				for (int i = 0; i < parsers.length; i++) {
					final TreeParser parser = parsers[i];

					stream.bookmark();
					if (parser.accepts(stream)) {
						stream.commit();
						return true;

					} else {
						stream.rewind();

						if (LOGGER.isTraceEnabled() && i + 1 < parsers.length)
							trace("or");
					}
				}

				// if (LOGGER.isTraceEnabled()) {
				// pop("<choice]");
				// }

				return false;
			}
		};
	};

	public TreeParser star(final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[star>");

				while (true) {
					stream.bookmark();

					if (!parser.accepts(stream)) {
						stream.rewind();
						break;
					}

					stream.commit();
				}

				if (LOGGER.isTraceEnabled())
					pop("<star]: yes");

				return true;
			}
		};
	}

	public TreeParser plus(final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[plus>");

				stream.bookmark();

				if (!parser.accepts(stream)) {
					stream.rewind();

					if (LOGGER.isTraceEnabled())
						pop("<plus]: no");

					return false;
				}

				stream.commit();

				while (true) {
					stream.bookmark();

					if (!parser.accepts(stream)) {
						stream.rewind();
						break;
					}

					stream.commit();
				}

				if (LOGGER.isTraceEnabled())
					pop("<plus]: yes");

				return true;
			}
		};
	}

	public TreeParser not(final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[not>");

				stream.bookmark();
				final boolean accepted = parser.accepts(stream);
				stream.rewind();

				if (LOGGER.isTraceEnabled())
					pop("<not]");

				return !accepted;
			}
		};
	}

	public TreeParser permuted(final TreeParser... parsers) {
		final List<TreeParser> choices = new ArrayList<TreeParser>(
				parsers.length);
		for (TreeParser parser : parsers) {
			choices.add(parser);
		}

		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[permuted>");

				List<TreeParser> remaining = new ArrayList<TreeParser>(choices);

				int i = 0;
				while (i < remaining.size()) {
					stream.bookmark();

					if (remaining.get(i).accepts(stream)) {
						stream.commit();
						remaining.remove(i);
						i = 0;

					} else {
						stream.rewind();
						i++;
					}
				}

				if (LOGGER.isTraceEnabled())
					pop("<permuted]");

				return true;
			}
		};
	};

	public TreeParser any() {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				final Data data = stream.forward();

				if (data != null) {
					if (LOGGER.isTraceEnabled())
						trace(data + " != null : yes");

					// assignIfNeeded(stream.getTree());
					scope.assignLValue(stream.getTree());

					return true;

				} else {
					if (LOGGER.isTraceEnabled())
						trace(data + " != null : no");

					return false;
				}
			}
		};
	}

	/**
	 * Skipping is the basics of tree parsers, so it pretty much comes for free.
	 */
	public TreeParser skipto(final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				if (LOGGER.isTraceEnabled())
					push("[skipto>");

				boolean accepts = parser.accepts(stream);

				if (LOGGER.isTraceEnabled())
					pop("<skipto]: " + (accepts ? "yes" : "no"));

				return accepts;
			}
		};
	}

	public TreeParser apply(final Block func) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				func.apply();
				return true;
			}
		};
	}

	public TreeParser assign(final String name, final TreeParser parser) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				scope.setLValueReceiver(name);
				// scope().put("=", new Assign(scope(), name));
				boolean accepts = parser.accepts(stream);
				// scope().remove("=");
				return accepts;
			}
		};
	}

	public TreeParser returning(final String name) {
		return new TreeParser() {
			public boolean accepts(TreeStream stream) {
				scope.setReturnValueFrom(name);
				return true;
			}
		};
	}

	// ------------------------------------------------------------------------

	private int depth = 0;

	private String indent() {
		String s = "";
		for (int i = 0; i < depth; i++)
			s += "  ";
		return s;
	}

	private void push(final String message) {
		LOGGER.trace(indent() + message);
		depth += 1;
	}

	private void trace(final String message) {
		LOGGER.trace(indent() + message);
	}

	private void pop(final String message) {
		depth -= 1;
		LOGGER.trace(indent() + message);
	}
}