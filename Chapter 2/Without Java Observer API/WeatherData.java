package app1;

import java.util.*;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer o: observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float press) {
        temperature = temp;
        humidity = humid;
        pressure = press;
        measurementsChanged();
    }
}