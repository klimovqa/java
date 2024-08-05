package ru.klimov.java.course.pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        MessageFactory factory = new TelegramMessageFactory();
        Message message = factory.createMessage("voice");
        message.create("Hello world!");
        message.send();
    }
}
