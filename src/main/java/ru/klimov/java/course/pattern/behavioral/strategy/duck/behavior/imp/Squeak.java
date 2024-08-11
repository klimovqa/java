package ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
