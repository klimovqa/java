package ru.klimov.java.course.pattern.duck.behavior.imp;

import ru.klimov.java.course.pattern.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
