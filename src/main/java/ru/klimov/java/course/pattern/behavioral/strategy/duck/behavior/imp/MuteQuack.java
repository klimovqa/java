package ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
