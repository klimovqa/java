package ru.klimov.java.course.pattern.behavioral.weather;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
