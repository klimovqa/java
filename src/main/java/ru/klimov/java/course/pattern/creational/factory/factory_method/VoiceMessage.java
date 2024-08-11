package ru.klimov.java.course.pattern.creational.factory.factory_method;

public class VoiceMessage extends Message {

    @Override
    public String create(String message) {
        msg = ">> voice message >>" + message;
        return msg;
    }

    @Override
    public void send() {
        System.out.println("Sending voice message - " + msg);
    }
}
