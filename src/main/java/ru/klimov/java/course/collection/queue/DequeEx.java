package ru.klimov.java.course.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(4);
        deque.addLast(2);
        deque.addFirst(3);
        System.out.println(deque);
    }
}
