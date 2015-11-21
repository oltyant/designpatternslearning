package oltyant.oo.observer.solution.own;

public interface Observer<E> {
	void update(Event<E> event);
}