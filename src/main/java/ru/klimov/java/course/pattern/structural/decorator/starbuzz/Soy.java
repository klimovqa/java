package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage){
        this.beverage = beverage;
        size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() { double cost = beverage.cost();
        if (Size.TALL == this.size) {
            cost += 0.15;
        }
        if (Size.GRANDE == size) {
            cost += .20;
        }
        if (Size.VENTI == size) {
            cost += .25;
        }
        return cost;
    }
}
