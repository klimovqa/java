package ru.klimov.java.course.pattern.factory.pizza.ny;

import ru.klimov.java.course.pattern.factory.pizza.Pizza;

public class NYStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("NY Style prepares Veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("NY Style bake Veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cut Veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("NY Style box Veggie pizza");
    }
}
