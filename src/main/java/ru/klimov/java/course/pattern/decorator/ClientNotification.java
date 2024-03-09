package ru.klimov.java.course.pattern.decorator;

public class ClientNotification {
    public static void main(String[] args) {
        Notification notification = new EmailNotification(new MessegerNotification(new SmsNotification()));
        notification.send();
    }
}
