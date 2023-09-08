package ru.klimov.java.course.generics.subtyping.modal;

import ru.klimov.java.course.generics.subtyping.action.Run;
import ru.klimov.java.course.generics.subtyping.action.Say;

public class Persian extends Cat implements Run, Say {
    public Persian(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Persian run!");
    }

    @Override
    public void say() {
        System.out.println("Persian say!");
    }
}
