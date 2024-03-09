package ru.klimov.java.course.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLRUCacheEx1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new SimpleLRUCache<>(2);
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);//{2=b, 3=c}
        map.get(2);
        System.out.println(map);//{3=c, 2=b}
        map.put(9,"x");
        System.out.println(map);//{2=b, 9=x}
    }
}
