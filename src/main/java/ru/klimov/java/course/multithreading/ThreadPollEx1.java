package ru.klimov.java.course.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class ThreadPollEx1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable100Imp());
        }
        executorService.shutdown();
    }
}

class Runnable100Imp implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
