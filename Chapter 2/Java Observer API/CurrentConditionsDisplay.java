package app2;
import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData wd = (WeatherData)obs;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        } 
    }

    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degress and " + humidity + "% humidity");
    }

}