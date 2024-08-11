package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        this.size = size;
        description = "House Blend Coffee (" + size + ")";
    }

    @Override
    public double cost() {
        double cost = 0.0;
        if (Size.TALL == size) {
            cost += 0.89;
        }
        if (Size.GRANDE == size) {
            cost += 1.00;
        }
        if (Size.VENTI == size) {
            cost += 1.09;
        }
        return cost;
    }
}
