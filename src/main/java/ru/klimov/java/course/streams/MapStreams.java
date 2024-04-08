package ru.klimov.java.course.streams;

import java.util.List;
import java.util.stream.Stream;

public class MapStreams {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "hello", "kak dela?");

        Stream<Integer> integerStream = list.stream().map(String::length);
        List<Integer> integers = list.stream().map(String::length).toList();
        System.out.println(integers);
    }
}
