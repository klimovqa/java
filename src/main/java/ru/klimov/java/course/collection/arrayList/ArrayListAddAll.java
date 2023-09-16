package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAll {

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integerList2 = new ArrayList<>(List.of(6, 7, 8, 9));
        List<Integer> integerList3 = new ArrayList<>(List.of(10, 11, 12, 13));
        integerList1.addAll(integerList2);
        integerList2.add(10);
        System.out.println(integerList2);
        System.out.println(integerList1);
        integerList2.addAll(0, integerList3);
        System.out.println(integerList2);
        ArrayList<Integer> list = new ArrayList<>();
        list.toString();
    }
}
