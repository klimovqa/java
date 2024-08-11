package ru.klimov.java.course.pattern.creational.factory.pizza;

import ru.klimov.java.course.pattern.creational.factory.pizza.ny.NYStyleCheesePizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.ny.NYStyleClamPizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.ny.NYStylePepperoniPizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.ny.NYStyleVeggiePizza;

public class NYPizzaStore  extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
