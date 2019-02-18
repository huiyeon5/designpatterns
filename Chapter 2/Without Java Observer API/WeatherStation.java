package app1;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wd);
        HeatIndexDisplay heatIndex = new HeatIndexDisplay(wd);

        wd.setMeasurements(80,65,30.4f);
        System.out.println();
        wd.setMeasurements(82,70,29.2f);
        System.out.println();
        wd.setMeasurements(78,90,29.2f);
    }
}