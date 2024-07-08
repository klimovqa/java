package ru.klimov.java.course.pattern.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.strategy.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
