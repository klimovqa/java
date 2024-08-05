package ru.klimov.java.course.pattern.factory.factory_method;

public abstract class Message {

    protected String msg;

    abstract String create(String message);

    abstract void send();
}
