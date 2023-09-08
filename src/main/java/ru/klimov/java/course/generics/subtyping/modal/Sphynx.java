package ru.klimov.java.course.generics.subtyping.modal;

import ru.klimov.java.course.generics.subtyping.action.Say;

public class Sphynx extends Cat implements Say {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("Sphynx say!");
    }
}
