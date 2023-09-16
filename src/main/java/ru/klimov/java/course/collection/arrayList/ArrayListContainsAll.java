package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsAll {

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integerList2 = new ArrayList<>(List.of(2, 3));
        System.out.println(integerList1.containsAll(integerList2));
    }
}
