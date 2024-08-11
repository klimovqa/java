package ru.klimov.java.course.pattern.structural.decorator;

public class MessegerNotification implements Notification{

    private Notification notification;

    public MessegerNotification() {
    }

    public MessegerNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) notification.send();
        System.out.println("Уведомление в messenger. ");
    }
}
