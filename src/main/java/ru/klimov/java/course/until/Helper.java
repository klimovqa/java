package ru.klimov.java.course.until;

import java.util.List;

public class Helper {

    public static <T> void print(List<T> list, String name) {
        System.out.println(name);
        System.out.println(list);
        System.out.println("----------------------------------------------------------------------");
    }

    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
