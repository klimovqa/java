package ru.klimov.java.course.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ThreadPollEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new Runnable200Imp());
//        }

        scheduledExecutorService.schedule(new Runnable200Imp(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class Runnable200Imp implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " -> start");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread() + " -> ends");
    }
}
