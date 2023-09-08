package ru.klimov.java.course.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(GenMethod.getSecondElement(list));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(GenMethod.getSecondElement(list2));

    }
}

class GenMethod<T> {
    public T getElement(List<T> list, int i) {
        return list.get(i);
    }

    public static <T> T getSecondElement(List<T> list) {
        return list.get(1);
    }
}
