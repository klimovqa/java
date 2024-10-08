package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

import static ru.klimov.java.course.pattern.structural.decorator.starbuzz.Beverage.Size.*;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(VENTI);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
