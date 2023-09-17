package ru.klimov.java.course.collection.linkedList;

import java.util.*;

public class LinkedListTest2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(1);
        list.offer(2);
        list.offerFirst(3);

        list.forEach(System.out::println);

        Integer peek = list.peek();
        System.out.println("----------");
        System.out.println(peek);
        Integer poll = list.poll();
        System.out.println("----------");
        System.out.println(poll);

        System.out.println("----------");
        list.forEach(System.out::println);

    }
}
