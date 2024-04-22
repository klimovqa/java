package ru.klimov.java.course.multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread1 попытка захватить объект lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread1 захватил монитор lock1");
            System.out.println("Thread1 попытка захватить объект lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread1 захватил монитор lock2 и lock1");
            }
        }
    }
}


class Thread2 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread2 попытка захватить объект lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread2 захватил монитор lock2");
            System.out.println("Thread2 попытка захватить объект lock1");
            synchronized (DeadLockEx.lock1){
                System.out.println("Thread2 захватил монитор lock2 и lock1");
            }
        }
    }
}
