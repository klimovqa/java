package ru.klimov.java.course.comparation;

import java.util.*;

import static ru.klimov.java.course.until.Helper.print;


public class ComparatorTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Миша", "Гриша", "Анна", "Сергей"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Миша",null, "Гриша", "Анна", "Сергей", null));
        List<String> list3 = new ArrayList<>(Arrays.asList("Привет", "Я очень хочу есть", "Как дела?"));

        print(list,"Исходный list");
        print(list2,"Исходный list2");

        Collections.sort(list, Comparator.reverseOrder());
        print(list,"Отсортированный в reverseOrder порядке list");

        Collections.sort(list, Comparator.naturalOrder());
        print(list,"Отсортированный в naturalOrder порядке list");

        Collections.sort(list2, Comparator.nullsLast(Comparator.naturalOrder()));
        print(list2,"Отсортированный в nullsLast(naturalOrder) порядке list");

        Collections.sort(list2, Comparator.nullsLast(Comparator.reverseOrder()));
        print(list2,"Отсортированный в nullsLast(reverseOrder) порядке list");

        Collections.sort(list2, Comparator.nullsFirst(Comparator.naturalOrder()));
        print(list2,"Отсортированный в nullsFirst(naturalOrder) порядке list");

        Collections.sort(list2, Comparator.nullsFirst(Comparator.reverseOrder()));
        print(list2,"Отсортированный в nullsFirst(reverseOrder) порядке list");

        list3.sort(new CountWordComparator());
        print(list3,"Отсортированный по числу слов в строке list3");
    }
}

class CountWordComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        String[] split1 = o1.split(" ");
        String[] split2 = o2.split(" ");
        return split1.length - split2.length;
    }
}
