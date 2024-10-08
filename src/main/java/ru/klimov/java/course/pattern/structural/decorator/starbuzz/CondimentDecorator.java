package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    Beverage.Size size;

    public abstract String getDescription();
}
