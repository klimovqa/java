package ru.klimov.java.course.pattern.creational.factory.pizza;


import ru.klimov.java.course.pattern.creational.factory.pizza.chicago.ChicagoStyleCheesePizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.chicago.ChicagoStyleClamPizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.chicago.ChicagoStylePepperoniPizza;
import ru.klimov.java.course.pattern.creational.factory.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
