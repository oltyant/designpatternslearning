package oltyant.oo.observer.worst;

import java.util.Random;

/**
 * Created by oltyant on 2015.11.17..
 */
public strictfp class WeatherData {
    private float humidity;
    private float temperature;
    private float pressure;
    private CurrentConditionsDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public float getHumidity() {
        humidity = humidity + Math.min(new Random().nextFloat(), humidity) / Math.max(new Random().nextFloat(), humidity);
        return humidity;
    }

    public float getTemperature() {
        temperature = temperature + Math.min(new Random().nextFloat(), temperature) / Math.max(new Random().nextFloat(), temperature);
        return temperature;
    }

    public float getPressure() {
        pressure = pressure + Math.min(new Random().nextFloat(), pressure) / Math.max(new Random().nextFloat(), pressure);
        return pressure;
    }

    public void measurementsChanged() {
        float temperature = getTemperature(); 
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
