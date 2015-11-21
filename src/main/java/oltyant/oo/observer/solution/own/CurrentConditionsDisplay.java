package oltyant.oo.observer.solution.own;

import java.util.Map;

public class CurrentConditionsDisplay implements Observer<Map<String, Float>>, DisplayElement<Map<String, Float>> {
	public void update(Event<Map<String, Float>> event) {
		display(event.getEvent());
	}

	public void display(Map<String, Float> data) {
		for (Map.Entry<String, Float> e : data.entrySet()) System.out.println(e.getKey() + " : " + e.getValue());
	}
}