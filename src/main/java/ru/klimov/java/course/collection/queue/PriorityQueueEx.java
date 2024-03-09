package ru.klimov.java.course.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(10);
        queue.add(2);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
