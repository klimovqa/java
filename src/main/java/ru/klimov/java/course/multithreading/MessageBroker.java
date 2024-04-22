package ru.klimov.java.course.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class MessageBroker {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Thread producer = new Thread(new ProducerMessage(broker));
        Thread consumer = new Thread(new ConsumerMessage(broker));
        producer.start();
        consumer.start();
    }
}

class ProducerMessage implements Runnable {

    Broker broker;

    public ProducerMessage(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        while (Broker.countMessage <= 100) {
            broker.putMessage();
        }
    }
}

class ConsumerMessage implements Runnable {

    Broker broker;

    public ConsumerMessage(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        while (Broker.countMessage <= 100) {
            broker.getMessage();
        }
    }
}

class Broker {

    public static int countMessage = 0;

    Queue<Message> queue = new LinkedList<>();

    public synchronized void getMessage() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        countMessage++;
        queue.poll();
        System.out.println("Получатель забрал сообщение из брокера");
        System.out.println("Сообщений в брокере: " + queue.size());
        notify();
    }

    public synchronized void putMessage() {
        while (queue.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(new Message());
        System.out.println("Производитель добавил сообщение в брокер");
        System.out.println("Сообщений в брокере: " + queue.size());
        notify();
    }
}

class Message {

}
