package ru.klimov.java.course.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankomatTryLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee2("Oleg", lock);
        new Employee2("Ivan", lock);
        new Employee2("Olga", lock);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee2("Misha", lock);
        new Employee2("Gleb", lock);
    }
}

class Employee2 extends Thread {

    private String name;
    private Lock lock;

    public Employee2(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {

                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил использование банкоматом");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не может ждать");
        }
    }
}
