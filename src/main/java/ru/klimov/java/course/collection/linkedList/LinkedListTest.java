package ru.klimov.java.course.collection.linkedList;

import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6, 7, 8, 9, 10));
        Iterator<Integer> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.addAll(list2);
        list.forEach(System.out::print);

        Spliterator<Integer> spliterator = list.spliterator();
        ListIterator<Integer> listIterator = list.listIterator();
    }
}
