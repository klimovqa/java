package ru.klimov.java.course.pattern.observer.weather;

public class StatisticsDisplay  implements Observer, DisplayElement {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float avgTemperature = 0.0f;
    private static int count = 0;

    private WeatherData weatherData;
    private float temperature;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        calculateStatistics();
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: " +
                "Temperature (MAX): " + maxTemperature + "°C" +
                " (MIN): " + minTemperature + "°C" +
                ", (AVG): " + avgTemperature + "°C");
    }

    private void calculateStatistics() {
        count++;
        maxTemperature = Math.max(maxTemperature, temperature);
        minTemperature = Math.min(minTemperature, temperature);
        avgTemperature = (avgTemperature * (count - 1) + temperature) / count;
    }
}
