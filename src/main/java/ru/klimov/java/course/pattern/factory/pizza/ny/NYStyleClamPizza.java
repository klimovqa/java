package ru.klimov.java.course.pattern.factory.pizza.ny;

import ru.klimov.java.course.pattern.factory.pizza.Pizza;

public class NYStyleClamPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("NY Style prepares Clam pizza");
    }

    @Override
    public void bake() {
        System.out.println("NY Style bake Clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("NY Style Cut Clam pizza");
    }

    @Override
    public void box() {
        System.out.println("NY Style box Clam pizza");
    }
}
