package ru.klimov.java.course.pattern.structural.decorator;

public class SmsNotification implements Notification{

    private Notification notification;

    public SmsNotification() {
    }

    public SmsNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        if (notification != null) notification.send();
        System.out.println("Уведомление по sms. ");
    }
}
