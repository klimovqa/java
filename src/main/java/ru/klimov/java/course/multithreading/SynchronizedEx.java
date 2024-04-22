package ru.klimov.java.course.multithreading;

public class SynchronizedEx {
    public static void main(String[] args) {
        RunnableImp runnable = new RunnableImp();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class RunnableImp implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }

    private void doWork2(){
        System.out.println("--------------");
    }

     private void doWork() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Thread.currentThread().getName() + " " + Counter.count);
        }
    }
}
