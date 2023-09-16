package ru.klimov.java.course.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {

    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> parentSubList = integerList1.subList(1, 4);
        List<Integer> childSubList = parentSubList.subList(0, 1);
        System.out.println("______________________________");
        System.out.println("integerList1: " + integerList1);
        System.out.println("parentSubList: " + parentSubList);
        System.out.println("childSubList: " + childSubList);
        //parentSubList.add(30); ConcurrentModificationException
        childSubList.add(10);
        System.out.println("______________________________");
        System.out.println("integerList1: " + integerList1);
        System.out.println("parentSubList: " + parentSubList);
        System.out.println("childSubList: " + childSubList);
        ArrayList<Integer> newList = new ArrayList<>(childSubList);
        newList.add(20);
        System.out.println("______________________________");
        System.out.println("integerList1: " + integerList1);
        System.out.println("parentSubList: " + parentSubList);
        System.out.println("childSubList: " + childSubList);
        System.out.println("newList: " + newList);
    }
}
