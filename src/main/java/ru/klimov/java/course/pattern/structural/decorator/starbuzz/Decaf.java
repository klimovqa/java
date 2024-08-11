package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee (" + size + ")";
    }

    @Override
    public double cost() {
        double cost = 0.0;
        if (Size.TALL == size) {
            cost += 1.05;
        }
        if (Size.GRANDE == size) {
            cost += 1.19;
        }
        if (Size.VENTI == size) {
            cost += 1.39;
        }
        return cost;
    }
}
