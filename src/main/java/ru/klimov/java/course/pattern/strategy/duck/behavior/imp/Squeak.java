package ru.klimov.java.course.pattern.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.strategy.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
