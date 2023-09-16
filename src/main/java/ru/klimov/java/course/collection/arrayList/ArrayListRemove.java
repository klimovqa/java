package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        integerList.removeIf(n -> n % 2 == 0);
        System.out.println(integerList);

        List<Integer> integerList2 = new ArrayList<>(List.of(1, 3, 7, 4, 2, 6, 7, 8, 9));
        Integer i2 = 2;
        integerList2.remove(2);
        integerList2.remove(i2);
        System.out.println(integerList2);
    }
}
