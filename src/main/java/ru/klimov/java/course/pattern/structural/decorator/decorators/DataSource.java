package ru.klimov.java.course.pattern.structural.decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
