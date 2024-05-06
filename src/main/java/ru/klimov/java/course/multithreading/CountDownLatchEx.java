package ru.klimov.java.course.multithreading;

import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class CountDownLatchEx {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOfPlace() throws InterruptedException {
        sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch=" + countDownLatch);
    }
    private static void everythingIsReady() throws InterruptedException {
        sleep(3000);
        System.out.println("Everything is ready");
        countDownLatch.countDown();
        System.out.println("countDownLatch=" + countDownLatch);
    }
    private static void openMarket() throws InterruptedException {
        sleep(3000);
        System.out.println("Open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch=" + countDownLatch);
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Oleg", countDownLatch);
        new Friend("Misha", countDownLatch);
        new Friend("Irina", countDownLatch);
        new Friend("Natasha", countDownLatch);
        new Friend("Rita", countDownLatch);

        marketStaffOfPlace();
        everythingIsReady();
        openMarket();
    }

    static class Friend extends Thread{
        private String name;
        private CountDownLatch countDownLatch;

        public Friend(String name, CountDownLatch countDownLatch) {
            this.name = name;
            this.countDownLatch = countDownLatch;
            this.start();
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();
                System.out.println(name + " приступила к покупкам");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
