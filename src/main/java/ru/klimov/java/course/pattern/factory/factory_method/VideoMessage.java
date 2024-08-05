package ru.klimov.java.course.pattern.factory.factory_method;

public class VideoMessage extends Message {

    @Override
    public String create(String message) {
        msg = ">> video message >>" + message;
        return msg;
    }

    @Override
    public void send() {
        System.out.println("Sending video message - " + msg);
    }
}
