package ru.klimov.java.course.pattern.structural.decorator.starbuzz;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;


    String description = "unknown beverages";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
