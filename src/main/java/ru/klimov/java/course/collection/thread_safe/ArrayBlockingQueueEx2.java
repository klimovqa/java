package ru.klimov.java.course.collection.thread_safe;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class ArrayBlockingQueueEx2 {

    static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.join();
        consumer.join();
    }

    static class Producer extends Thread {

        public Producer() {
            this.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Random random = new Random();
                int val = random.nextInt(10);
                System.out.println("В очередь добавили - " + val);
                queue.offer(val);
                String join = queue.stream().map(String::valueOf)
                        .collect(Collectors.joining(" "));
                System.out.println("Очередь состоит из " + join);
            }
        }
    }

    static class Consumer extends Thread {

        public Consumer() {
            this.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (queue.isEmpty()) {
                    System.out.println("Очередь пуста");
                    break;
                }
                System.out.println("Из очереди забрали - " + queue.poll());
            }
        }
    }
}


