package ru.klimov.java.course.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {
    public static List<Car> createThreeCar(Supplier<Car> supplier) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        System.out.println(createThreeCar(() ->
                new Car("BMW", "Black", 3.5)));
        Car car = new Car("BMW", "Black", 3.5);
        changeCar(car, c -> c.color = "Red");
        System.out.println(car);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
