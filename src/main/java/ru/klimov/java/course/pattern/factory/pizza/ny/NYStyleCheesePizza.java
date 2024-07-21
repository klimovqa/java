package ru.klimov.java.course.pattern.factory.pizza.ny;

import ru.klimov.java.course.pattern.factory.pizza.Pizza;

public class NYStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NY Style prepares cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("NY Style bake cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cut cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("NY Style box cheese pizza");
    }
}
