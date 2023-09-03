package ru.klimov.java.course.comparation;

import ru.klimov.java.course.until.Helper;

import java.util.*;
import java.util.stream.Stream;

import static ru.klimov.java.course.until.Helper.*;


public class ComparableTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Миша", "Гриша", "Анна", "Сергей"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(12, 11, 3, 45));

        print(list, "Исходный list");
        print(list2, "Исходный list2");

        Collections.sort(list);
        print(list, "Отсортированный naturalOrder list");

        Collections.sort(list2);
        print(list2, "Отсортированный naturalOrder list2");

        Stream<Integer> sorted = list2.stream().sorted();
        print(sorted.toList(), "Отсортированный naturalOrder list2 stream");
    }
}
