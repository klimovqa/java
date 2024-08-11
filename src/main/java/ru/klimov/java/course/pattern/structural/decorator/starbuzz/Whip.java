package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (Size.TALL == size) {
            cost += 0.10;
        }
        if (Size.GRANDE == size) {
            cost += .15;
        }
        if (Size.VENTI == size) {
            cost += .20;
        }
        return cost;
    }
}
