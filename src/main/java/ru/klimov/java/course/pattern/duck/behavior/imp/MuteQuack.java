package ru.klimov.java.course.pattern.duck.behavior.imp;

import ru.klimov.java.course.pattern.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
