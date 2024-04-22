package ru.klimov.java.course.multithreading;

public class VolatileEx2 extends Thread {
    static long a = 0;

    static synchronized void inc() {
        a++;
        System.out.println(Thread.currentThread().getName() + " val:" + a);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            inc();
        }
    }

    public static void main(String[] args) {
        VolatileEx2 thread1 = new VolatileEx2();
        VolatileEx2 thread2 = new VolatileEx2();
        VolatileEx2 thread3 = new VolatileEx2();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
