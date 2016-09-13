package koopa.cobol.parser.preprocessing.replacing;

import static koopa.core.data.tags.AreaTag.COMMENT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.apache.log4j.Logger;

import koopa.cobol.parser.preprocessing.replacing.ReplacingPhraseOperand.Type;
import koopa.core.data.Data;
import koopa.core.data.Token;
import koopa.core.data.Tokens;
import koopa.core.data.tags.AreaTag;
import koopa.core.sources.Source;

public class ReplaceLeading extends ReplacingPhrase {

	private static final Logger LOGGER = Logger
			.getLogger("source.cobol.preprocessing.replacing.leading");

	private final String pattern;
	private final int patternLength;
	private final List<Token> replacement;

	public ReplaceLeading(ReplacingPhraseOperand replacing,
			ReplacingPhraseOperand by) {
		super(replacing, by);

		final List<Token> replacingWords = replacing.getTextWords();
		final List<Token> byWords = by.getTextWords();

		assert (replacing.getType() == Type.PSEUDO && replacingWords.size() == 1);
		assert (by.getType() == Type.PSEUDO && byWords.size() <= 1);

		final Token leading = replacingWords.get(0);
		pattern = leading.getText().toUpperCase();
		patternLength = pattern.length();

		if (byWords.size() == 0)
			replacement = null;
		else {
			replacement = new ArrayList<Token>(2);
			replacement.add(byWords.get(0));
			replacement.add(null);
		}
	}

	public boolean appliedTo(Source<Data> library, LinkedList<Token> newTokens) {

		final Stack<Token> seen = new Stack<Token>();
		final Token next = nextTextWord(library, seen);

		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("Trying " + this);
			LOGGER.trace("  On " + next);
		}

		if (next != null && !next.hasTag(COMMENT)) {
			final String text = next.getText().toUpperCase();
			if (text.startsWith(pattern)) {
				if (LOGGER.isTraceEnabled())
					LOGGER.trace("  We have a match.");

				final Token tail = Tokens.subtoken(next, patternLength);

				if (replacement == null) {
					if (LOGGER.isTraceEnabled())
						LOGGER.trace("  Replacing with: " + tail);

					newTokens.add(tail);
					return true;

				} else {
					replacement.set(1, tail);
					final Token newToken = Tokens.join(replacement,
							AreaTag.PROGRAM_TEXT_AREA);

					if (LOGGER.isTraceEnabled())
						LOGGER.trace("  Replacing with: " + newToken);

					newTokens.add(newToken);
					return true;
				}
			}
		}

		library.unshift(next);
		unshiftStack(library, seen);

		return false;
	}

	@Override
	public String toString() {
		return "REPLACING LEADING " + replacing + " BY " + by;
	}
}
