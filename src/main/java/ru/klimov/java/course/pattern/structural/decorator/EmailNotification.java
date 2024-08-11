package ru.klimov.java.course.pattern.structural.decorator;

public class EmailNotification implements Notification{

    private Notification notification;

    public EmailNotification() {
    }

    public EmailNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) notification.send();
        System.out.println("Уведомление по email. ");
    }
}
