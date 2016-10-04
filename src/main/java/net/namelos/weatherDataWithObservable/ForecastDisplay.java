package net.namelos.weatherDataWithObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
    Observable observable;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
    }
}
