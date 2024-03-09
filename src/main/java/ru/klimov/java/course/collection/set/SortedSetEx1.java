package ru.klimov.java.course.collection.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx1 {
    static NavigableSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        System.out.println(set);
        System.out.println(getNextElem(7));
        System.out.println(getPrevElems(5));
    }

    static Integer getNextElem(Integer element){
        return set.higher(element);
    }

    static Set<Integer> getPrevElems(Integer element) {
        SortedSet<Integer> res = set.headSet(element);
        return res;
    }
}
