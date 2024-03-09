package ru.klimov.java.course.collection.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(5, 6);
        treeMap.put(7, 44);
        treeMap.put(1, 6232);
        treeMap.put(3, 77);
        treeMap.put(9, 50);
        treeMap.put(8, 9);
        System.out.println(treeMap);
        System.out.println(treeMap.ceilingEntry(5));
        System.out.println(treeMap.headMap(8));
        System.out.println(treeMap.tailMap(7));
        System.out.println(treeMap.higherKey(5));
        System.out.println(treeMap.values());
        System.out.println(2<<3);
    }
}
