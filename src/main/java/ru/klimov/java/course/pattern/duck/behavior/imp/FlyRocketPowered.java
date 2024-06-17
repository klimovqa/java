package ru.klimov.java.course.pattern.duck.behavior.imp;

import ru.klimov.java.course.pattern.duck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
