package ru.klimov.java.course.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCF GHADSABC";

        //Pattern pattern = Pattern.compile("ABC");//последовательность
        //Pattern pattern = Pattern.compile("[ABC]");//[a или b или c]
        Pattern pattern = Pattern.compile("ABC[D-T]");//[диапозон]
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
