package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (Size.TALL == size) {
            cost += 0.20;
        }
        if (Size.GRANDE == size) {
            cost += .25;
        }
        if (Size.VENTI == size) {
            cost += .30;
        }
        return cost;
    }
}
