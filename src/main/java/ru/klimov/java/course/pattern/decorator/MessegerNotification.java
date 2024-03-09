package ru.klimov.java.course.pattern.decorator;

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
