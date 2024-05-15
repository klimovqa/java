package ru.klimov.java.course.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    //private static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunnableEx111());
        Thread thread2 = new Thread(new RunnableEx111());
        thread2.start();
        thread1.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class RunnableEx111 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
