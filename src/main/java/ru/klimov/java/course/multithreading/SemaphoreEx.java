package ru.klimov.java.course.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Oleg", callBox);
        new Person("Grisha", callBox);
        new Person("Marina", callBox);
        new Person("Oksana", callBox);
        new Person("Igor", callBox);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s ждет...\n", name);
            callBox.acquire();
            System.out.printf("%s пользуется телефоном \n", name);
            sleep(2000);
            System.out.printf("%s завершил пользование телефоном \n", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}
