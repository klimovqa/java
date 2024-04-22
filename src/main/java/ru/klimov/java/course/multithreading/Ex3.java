package ru.klimov.java.course.multithreading;

public class Ex3 implements Runnable{


    @Override
    public void run() {
        System.out.println("Method run. Thread name - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex3());
        thread.start();

        System.out.println("Method run. Thread name - " + Thread.currentThread().getName());
    }
}
