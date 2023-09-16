package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplaceAll {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 4, 3, 2, 1, 4));
        list.replaceAll(n -> n + 10);
        //[11, 12, 14, 13, 12, 11, 14]
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(List.of("misha", "alex", "igor"));
        list2.replaceAll(String::toUpperCase);
        //[MISHA, ALEX, IGOR]
        System.out.println(list2);
    }
}
