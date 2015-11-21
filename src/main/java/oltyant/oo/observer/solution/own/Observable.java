package oltyant.oo.observer.solution.own;

public interface Observable<E> {
	void subscribe(Observer<E> observer);
	void unsubscribe(Observer<E> observer);
	void publish(Event<E> event);
}