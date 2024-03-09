package ru.klimov.java.course.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(5);
        System.out.println(set);

    }
}
