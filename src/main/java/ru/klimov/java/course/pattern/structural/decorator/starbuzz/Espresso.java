package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        this.size = size;
        description = "Espresso (" + size + ")";
    }

    @Override
    public double cost() {
        double cost = 0.0;
        if (Size.TALL == size) {
            cost += 1.99;
        }
        if (Size.GRANDE == size) {
            cost += 2.09;
        }
        if (Size.VENTI == size) {
            cost += 2.29;
        }
        return cost;
    }
}
