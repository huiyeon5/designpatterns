package app2;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        // No need anymore as the Observable Class handles that
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float press) {
        temperature = temp;
        humidity = humid;
        pressure = press;
        measurementsChanged();
    }

    /**
     * @return the humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @return the pressure
     */
    public float getPressure() {
        return pressure;
    }
}