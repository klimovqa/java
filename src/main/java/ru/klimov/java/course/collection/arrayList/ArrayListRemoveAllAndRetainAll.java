package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAllAndRetainAll {

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integerList2 = new ArrayList<>(List.of(2, 3));
        //integerList1.removeAll(integerList2);//[1, 4, 5]
        integerList1.retainAll(integerList2);
        System.out.println(integerList1);
    }
}
