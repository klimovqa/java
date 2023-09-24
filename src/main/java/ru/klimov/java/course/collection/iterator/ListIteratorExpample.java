package ru.klimov.java.course.collection.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorExpample {

    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;

        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if (listIterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
