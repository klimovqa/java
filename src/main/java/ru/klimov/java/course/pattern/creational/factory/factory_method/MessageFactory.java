package ru.klimov.java.course.pattern.creational.factory.factory_method;

public abstract class MessageFactory {
    public abstract Message createMessage(String typeMessage);
}
