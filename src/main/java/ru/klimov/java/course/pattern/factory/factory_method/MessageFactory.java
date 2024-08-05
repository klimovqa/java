package ru.klimov.java.course.pattern.factory.factory_method;

public abstract class MessageFactory {
    public abstract Message createMessage(String typeMessage);
}
