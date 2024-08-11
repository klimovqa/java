package ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.imp;

import ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
