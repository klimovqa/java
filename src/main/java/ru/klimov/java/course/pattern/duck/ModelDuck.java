package ru.klimov.java.course.pattern.duck;

import ru.klimov.java.course.pattern.duck.behavior.imp.FlyNoWay;
import ru.klimov.java.course.pattern.duck.behavior.imp.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
