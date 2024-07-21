package ru.klimov.java.course.pattern.factory.pizza.chicago;

import ru.klimov.java.course.pattern.factory.pizza.Pizza;

public class ChicagoStyleClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing chicago style pizza clam");
    }

    @Override
    public void bake() {
        System.out.println("baking chicago style pizza clam");

    }

    @Override
    public void cut() {
        System.out.println("cutting chicago style pizza clam");

    }

    @Override
    public void box() {
        System.out.println("boxing chicago style pizza clam");
    }
}
