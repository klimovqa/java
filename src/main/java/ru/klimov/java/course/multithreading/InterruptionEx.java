package ru.klimov.java.course.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();
        interruptedThread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1_000_000_000; i++) {
            if (interrupted()) {
                System.out.println("Thread interrupt");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
