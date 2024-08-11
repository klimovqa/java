package ru.klimov.java.course.pattern.creational.factory.pizza.chicago;

import ru.klimov.java.course.pattern.creational.factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing chicago style pizza pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("baking chicago style pizza pepperoni");

    }

    @Override
    public void cut() {
        System.out.println("cutting chicago style pizza pepperoni");

    }

    @Override
    public void box() {
        System.out.println("boxing chicago style pizza pepperoni");
    }
}
