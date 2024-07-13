package ru.klimov.java.course.pattern.decorator.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size){
        description = "Dark Roast (" + size + ")";
        this.size = size;
    }

    @Override
    public double cost() {
        double cost = 0.0;
        if (Size.TALL == size) {
            cost += 0.99;
        }
        if (Size.GRANDE == size) {
            cost += 1.09;
        }
        if (Size.VENTI == size) {
            cost += 1.29;
        }
        return cost;
    }
}
