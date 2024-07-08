package ru.klimov.java.course.pattern.observer.weather;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;


    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + temperature + "C degrees and " + humidity + "% humidity");
    }

}
