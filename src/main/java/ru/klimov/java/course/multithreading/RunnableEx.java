package ru.klimov.java.course.multithreading;

public class RunnableEx {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnableThread1());
        Thread t2 = new Thread(new MyRunnableThread2());

        t1.start();
        t2.start();
    }
}

class MyRunnableThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("1 Thread");
        }
    }
}
class MyRunnableThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("2 Thread");
        }
    }
}
