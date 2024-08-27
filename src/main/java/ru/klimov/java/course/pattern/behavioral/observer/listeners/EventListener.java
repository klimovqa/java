package ru.klimov.java.course.pattern.behavioral.observer.listeners;
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
