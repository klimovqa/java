package ru.klimov.java.course.pattern.creational.factory.pizza.ny;

import ru.klimov.java.course.pattern.creational.factory.pizza.Pizza;

public class NYStylePepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY Style prepares Pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("NY Style bake Pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cut Pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("NY Style box Pepperoni pizza");
    }
}
