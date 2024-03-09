package ru.klimov.java.course.compareCollection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static ru.klimov.java.course.until.Helper.measureTime;

public class CompareCollection {
    public static void main(String[] args) {
        final Integer COUNT_ELEMENT = 1_000_000;

        System.out.println("ArrayList (add):");
        measureTime(() -> {
            List<Integer> list = new ArrayList<>();
            IntStream.range(0, COUNT_ELEMENT).forEach(n -> {
                list.add(n);
            });
        });

        System.out.println("LinkedList (add):");
        measureTime(() -> {
            List<Integer> list = new LinkedList<>();
            IntStream.range(0, COUNT_ELEMENT).forEach(n -> {
                list.add(n);
            });
        });


        System.out.println("LinkedList (add index 0):");
        measureTime(() -> {
            List<Integer> list = new LinkedList<>();
            IntStream.range(0, COUNT_ELEMENT).forEach(n -> {
                list.add(0, n);
            });
        });

        System.out.println("ArrayList (add index 0):");
        measureTime(() -> {
            List<Integer> list = new ArrayList<>();
            IntStream.range(0, COUNT_ELEMENT).forEach(n -> {
                list.add(0, n);
            });
        });
    }
}
