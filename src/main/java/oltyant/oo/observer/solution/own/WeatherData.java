package oltyant.oo.observer.solution.own;

import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


/**
 * Created by oltyant on 2015.11.17..
 */
public strictfp class WeatherData implements Observable<Map<String, Float>> {
    private float humidity;
    private float temperature;
    private float pressure;
    private List<Observer<Map<String, Float>>> registeredObservers; 

    public WeatherData() {
        registeredObservers = new ArrayList<Observer<Map<String, Float>>>();
    }

    public void subscribe(Observer<Map<String, Float>> observer) {
        if (!registeredObservers.contains(observer)) registeredObservers.add(observer);
    }

    public void unsubscribe(Observer<Map<String, Float>> observer) {
        if (registeredObservers.contains(observer)) registeredObservers.remove(observer);
    }

    public void publish(Event<Map<String, Float>> event) {
        for (Observer<Map<String, Float>> observer : registeredObservers) {
            observer.update(event);
        }
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

        Event<Map<String, Float>> measureChangedEvent = new WeatherDataObject(temperature, humidity, pressure);
        publish(measureChangedEvent);
    }
}