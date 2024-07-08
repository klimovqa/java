package ru.klimov.java.course.pattern.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.strategy.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
