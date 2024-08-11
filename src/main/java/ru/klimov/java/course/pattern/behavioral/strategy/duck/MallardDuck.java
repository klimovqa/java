package ru.klimov.java.course.pattern.behavioral.strategy.duck;

import ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.imp.FlyWithWings;
import ru.klimov.java.course.pattern.behavioral.strategy.duck.behavior.imp.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard");
    }
}
