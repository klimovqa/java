package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListInit {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        integerList.set(1, 5);
        System.out.println(integerList);

        List<Integer> integerList2 = Arrays.asList(1, 2, 3);
        integerList2.set(1, 10);
        System.out.println(integerList2);

        List<Integer> integerList3 = new LinkedList<>(List.of(1, 2, 3));
        List<Integer> integerList4 = new ArrayList<>(integerList3);
        integerList4.set(1, 7);
        integerList4.forEach(System.out::println);

    }
}
