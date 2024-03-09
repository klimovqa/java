package ru.klimov.java.course.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");


        Map<Integer, String> map2 = new HashMap<>();
        map2.put(6, "f");
        map2.put(7, "g");

        System.out.println(map.size());

        for (Map.Entry<Integer, String> val : map.entrySet()) {
            System.out.println(val.getKey() + ":" + val.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + ":" + v));
        map.putAll(map2);
        System.out.println();
        map.forEach((k,v) -> System.out.println(k + ":" + v));


    }


}
