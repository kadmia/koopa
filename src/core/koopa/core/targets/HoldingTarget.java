package koopa.core.targets;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import koopa.core.data.Data;
import koopa.core.data.Token;
import koopa.core.util.Iterators;

/**
 * This is a {@linkplain Target} which will refrain from forwarding its
 * {@linkplain Data} to another target until instructed to do so 'via
 * {@link #shiftAllToNextTarget()}).
 * <p>
 * In addition to the delay, you can also retract the data which was pushed up
 * to the point of the last {@link #shiftAllToNextTarget()}.
 */
public class HoldingTarget implements Target<Data> {

	/** The recipient of our {@linkplain Data}. */
	private final Target<Data> target;

	/** The {@linkplain Data} we're holding on to. */
	private final LinkedList<Data> queue;

	/** Who wants to be notified about incoming {@linkplain Data} ? */
	private final List<Observer> observers;

	private boolean notificationsInProgress = false;

	public HoldingTarget(Target<Data> target) {
		assert (target != null);
		this.target = target;
		this.queue = new LinkedList<Data>();
		this.observers = new LinkedList<Observer>();
	}

	/** {@inheritDoc} */
	public void push(Data data) {
		queue.addLast(data);

		if (!(data instanceof Token))
			return;

		final Token token = (Token) data;

		if (token.isSkipped())
			return;

		if (!notificationsInProgress) {
			notificationsInProgress = true;

			for (Observer observer : observers)
				observer.pushed(this, token);

			assert (queue.getLast() == data);

			notificationsInProgress = false;
		}
	}

	public Token peekAtLastToken() {
		ListIterator<Data> it = queue.listIterator(queue.size());

		while (it.hasPrevious()) {
			final Data d = it.previous();
			if (d instanceof Token) {
				final Token t = (Token) d;
				return t;
			}
		}

		return null;
	}

	/** {@inheritDoc} */
	public void done() {
	}

	// ========================================================================

	/**
	 * Undoes the latest {@link #push(Data)}, returning the data which was
	 * pushed.
	 */
	public Data pop() {
		assert (!queue.isEmpty());
		final Data last = queue.removeLast();

		if (!notificationsInProgress && last instanceof Token) {
			final Token token = (Token) last;

			if (!token.isSkipped()) {
				notificationsInProgress = true;

				final Token data = peekAtLastToken();

				for (Observer observer : observers)
					observer.popping(this, token);

				assert (peekAtLastToken() == data);

				notificationsInProgress = false;
			}
		}

		return last;
	}

	/**
	 * This will {@linkplain Target#push(Data)} all data which is being held
	 * {@link TokenTracker} the {@link #target}.
	 */
	public void shiftAllToNextTarget() {
		while (!queue.isEmpty()) {
			final Data data = queue.removeFirst();
			target.push(data);
		}
	}

	/**
	 * Whether or not we're holding on to {@linkplain Data}.
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/** How much {@linkplain Data} we're holding on to. */
	public int size() {
		return queue.size();
	}

	/**
	 * Get an {@linkplain Iterator} over all {@linkplain Data} being held, in
	 * reverse order.
	 */
	public Iterator<Data> descendingIterator() {
		return Iterators.descendingIterator(queue);
	}

	/**
	 * Get an {@linkplain Iterator} over all {@linkplain Data} being held,
	 * starting at the given index.
	 */
	public Iterator<Data> listIterator(int index) {
		return Iterators.listIterator(queue, index);
	}

	// ========================================================================

	public interface Observer {
		void start(HoldingTarget holdingTarget, Token last);

		void pushed(HoldingTarget holdingTarget, Token data);

		void popping(HoldingTarget holdingTarget, Token last);
	}

	public void addObserver(Observer observer) {
		observers.add(observer);

		if (!notificationsInProgress) {
			notificationsInProgress = true;

			final Token token = peekAtLastToken();

			observer.start(this, token);

			assert (peekAtLastToken() == token);

			notificationsInProgress = false;
		}
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}