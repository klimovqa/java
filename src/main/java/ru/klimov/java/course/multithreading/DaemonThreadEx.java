package ru.klimov.java.course.multithreading;

public class DaemonThreadEx {
    public static void main(String[] args) {
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        for (char ch = 'A'; ch < 'G'; ch++) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ch + ". User name " + Thread.currentThread().getName() +
                    " is daemon " + isDaemon());
        }
    }
}


class DaemonThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + ". Daemon name " + Thread.currentThread().getName() +
                    " is daemon " + isDaemon());
        }
    }
}
