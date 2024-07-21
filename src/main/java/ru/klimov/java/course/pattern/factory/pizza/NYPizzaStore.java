package ru.klimov.java.course.pattern.factory.pizza;

import ru.klimov.java.course.pattern.factory.pizza.ny.NYStyleCheesePizza;
import ru.klimov.java.course.pattern.factory.pizza.ny.NYStyleClamPizza;
import ru.klimov.java.course.pattern.factory.pizza.ny.NYStylePepperoniPizza;
import ru.klimov.java.course.pattern.factory.pizza.ny.NYStyleVeggiePizza;

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
