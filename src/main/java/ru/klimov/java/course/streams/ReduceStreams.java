package ru.klimov.java.course.streams;

import java.util.List;

public class ReduceStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Integer integer = list.stream()
                .reduce(Integer::sum).get();
        System.out.println(integer);
    }
}
