package ru.klimov.java.course.generics.subtyping.logic;

import ru.klimov.java.course.generics.subtyping.action.Run;
import ru.klimov.java.course.generics.subtyping.action.Say;
import ru.klimov.java.course.generics.subtyping.modal.Cat;

import java.util.ArrayList;
import java.util.List;

public class Exposition<T extends Cat & Say & Run> {

    List<T> cats;

    public Exposition() {
        this.cats = new ArrayList<>();
    }

    public void addCat(T cat) {
        cats.add(cat);
        System.out.printf("%s added", cat.getName());
        System.out.println("");
    }

}
