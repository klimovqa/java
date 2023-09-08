package ru.klimov.java.course.generics.wildcards;

import ru.klimov.java.course.generics.subtyping.modal.*;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {
        List<Cat> catsList = new ArrayList<>();
        List<Persian> persianList = new ArrayList<>();

        catsList.add(new Angora("Barsik"));
        catsList.add(new Bengal("Pushok"));
        persianList.add(new Persian("Persian"));

        showCat1(catsList);
        showCat1(persianList);

        showCat2(catsList);
    }

    public static void showCat1(List<? extends Cat> catsList){
        System.out.println(catsList);
    }

    public static void showCat2(List<? super Sphynx> catsList){
        System.out.println(catsList);
    }
}
