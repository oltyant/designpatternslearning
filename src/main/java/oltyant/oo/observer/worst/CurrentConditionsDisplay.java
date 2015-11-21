package oltyant.oo.observer.worst;

public strictfp class CurrentConditionsDisplay implements DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public void display() {
		System.out.println("Temperature is " + temperature + "\nHumidity is " + humidity + "\nPressure is " + pressure);
	}
}