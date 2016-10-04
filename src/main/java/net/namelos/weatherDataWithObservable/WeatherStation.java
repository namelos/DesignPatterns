package net.namelos.weatherDataWithObservable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(7, 8, 9);
    }
}

