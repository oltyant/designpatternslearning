package oltyant.oo.observer.worst;

import java.util.Random;

/**
 * Created by oltyant on 2015.11.17..
 */
public strictfp class WeatherData {
    public float getHumidity() {
        return new Random().nextFloat();
    }

    public float getTemperature() {
        return new Random().nextFloat();
    }

    public float getPressure() {
        return new Random().nextFloat();
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humid = getHumidity();
        float press = getPressure();


    }
}
