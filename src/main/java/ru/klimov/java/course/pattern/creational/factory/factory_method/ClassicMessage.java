package ru.klimov.java.course.pattern.creational.factory.factory_method;

public class ClassicMessage extends Message {

    @Override
    public String create(String message) {
        msg = ">> classic message >>" + message;
        return msg;
    }

    @Override
    public void send() {
        System.out.println("Sending classic message - " + msg);
    }
}
