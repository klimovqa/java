package ru.klimov.java.course.multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Thread producer = new Thread(new Producer(market));
        Thread consumer = new Thread(new Consumer(market));
        producer.start();
        consumer.start();
    }
}


class Market{
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Покупатель купил 1 хлеб");
        System.out.println("В магазине осталось хлеба = " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Продавец добавил 1 хлеб");
        System.out.println("В магазине осталось хлеба = " + breadCount);
        notify();
    }

}

class Producer implements Runnable{

    private Market market;


    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable{

    private Market market;


    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}