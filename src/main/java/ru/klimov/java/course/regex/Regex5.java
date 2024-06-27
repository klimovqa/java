package ru.klimov.java.course.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String myCards = "23259848234928560327543;" +
                "33259438234928560430543;" +
                "53259848234928560332543";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myCards);

        String newMyCard = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(newMyCard);
    }
}
