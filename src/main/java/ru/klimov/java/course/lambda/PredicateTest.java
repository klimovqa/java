package ru.klimov.java.course.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("java guru");
        list.add("hi");
        list.add("do it");
        System.out.println(list);
//        Predicate<String> p1 = str -> str.length() > 2;
//        Predicate<String> p2 = str -> str.length() < 5;
//        list.removeIf(p1.and(p2).negate());
        list.removeIf(((Predicate<String>) str -> str.length() > 2)
                .and(str -> str.length() < 5).negate());
        System.out.println(list);
    }
}
