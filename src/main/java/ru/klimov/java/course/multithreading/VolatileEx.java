package ru.klimov.java.course.multithreading;

public class VolatileEx extends Thread{
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finish. counter = " + counter);

    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(300);
        System.out.println("-------------");
        thread.b = false;
        thread.join();
    }
}
