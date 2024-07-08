package ru.klimov.java.course.pattern.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.strategy.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
