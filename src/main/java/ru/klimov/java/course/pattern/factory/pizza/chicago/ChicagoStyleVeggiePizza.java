package ru.klimov.java.course.pattern.factory.pizza.chicago;

import ru.klimov.java.course.pattern.factory.pizza.Pizza;

public class ChicagoStyleVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing chicago style pizza veggie");
    }

    @Override
    public void bake() {
        System.out.println("baking chicago style pizza veggie");

    }

    @Override
    public void cut() {
        System.out.println("cutting chicago style pizza veggie");

    }

    @Override
    public void box() {
        System.out.println("boxing chicago style pizza veggie");
    }
}
