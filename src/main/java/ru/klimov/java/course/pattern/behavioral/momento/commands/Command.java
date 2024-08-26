package ru.klimov.java.course.pattern.behavioral.momento.commands;

public interface Command {
    String getName();
    void execute();
}
