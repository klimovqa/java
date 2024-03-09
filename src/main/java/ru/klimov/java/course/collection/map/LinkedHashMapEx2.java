package ru.klimov.java.course.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>(5, 1, true);
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");
        System.out.println(map);//{5=a, 4=b, 3=c, 2=d, 1=e}
        map.get(5);
        map.get(4);
        map.get(5);
        System.out.println(map);//{3=c, 2=d, 1=e, 4=b, 5=a}
    }
}
