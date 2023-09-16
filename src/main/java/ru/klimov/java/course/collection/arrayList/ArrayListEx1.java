package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        List<Integer> integerList2 = new ArrayList<>(integerList);
        System.out.println(integerList);
        System.out.println(integerList2);
        integerList2.remove(1);
        System.out.println("После изменения");
        System.out.println(integerList);
        System.out.println(integerList2);
    }
}
