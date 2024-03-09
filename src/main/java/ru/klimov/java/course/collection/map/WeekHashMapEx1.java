package ru.klimov.java.course.collection.map;

import java.util.*;

public class WeekHashMapEx1 {

    public static void main(String[] args) {
        Map<Date, String> map = new WeakHashMap<>();
        Date date = new Date();
        map.put(date, "info");

        date = null;
        System.gc();

        for (int i = 0; i < 10000; i++) {
            if (map.isEmpty()) {
                System.out.println(i);
                System.out.println("Map empty!");
                break;
            }
        }
    }
}
