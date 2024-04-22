package ru.klimov.java.course.multithreading;

public class CallEx {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile end call");
        }
    }

    void telegramCall() {
        synchronized (lock) {
            System.out.println("Telegram call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Telegram end call");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype end call");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunMobile());
        Thread t2 = new Thread(new RunTelegram());
        Thread t3 = new Thread(new RunSkype());
        t1.start();
        t2.start();
        t3.start();
    }
}

class RunMobile implements Runnable {
    @Override
    public void run() {
        new CallEx().mobileCall();
    }
}

class RunTelegram implements Runnable {
    @Override
    public void run() {
        new CallEx().telegramCall();
    }
}

class RunSkype implements Runnable {
    @Override
    public void run() {
        new CallEx().skypeCall();
    }
}
