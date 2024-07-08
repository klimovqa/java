package ru.klimov.java.course.pattern.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "%, " + pressure + " hPa");
    }
}
