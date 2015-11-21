package oltyant.oo.observer.solution.own;

import java.util.Map;
import java.util.HashMap;

public class WeatherDataObject implements Event<Map<String, Float>> {
	private final Map<String, Float> weatherData = new HashMap<String, Float>();

	public enum DataName {
		TEMPERATURE("temperature"),
		HUMIDITY("humidity"),
		PRESSURE("pressure");

		private final String dataName;

		private DataName(String name) {
			this.dataName = name;
		}

		public String getDataName() {
			return this.dataName;
		}
	}

	public WeatherDataObject(float temperature, float humidity, float pressure) {
		weatherData.put(DataName.TEMPERATURE.getDataName(), temperature);
		weatherData.put(DataName.HUMIDITY.getDataName(), humidity);
		weatherData.put(DataName.PRESSURE.getDataName(), pressure);
	}

	@Override
	public Map<String, Float> getEvent() {
		return weatherData;
	}
}