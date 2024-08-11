package ru.klimov.java.course.pattern.creational.builders;

import ru.klimov.java.course.pattern.creational.builders.cars.Car;
import ru.klimov.java.course.pattern.creational.builders.cars.Manual;
import ru.klimov.java.course.pattern.creational.builders.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        car.getTripComputer().showFuelLevel();


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        car.getEngine().on();
        car.setFuel(10);
        car.getEngine().go(15);
        car.getTripComputer().showFuelLevel();
        car.getTripComputer().showStatus();
        car.getEngine().go(15);
        System.out.println(car.getEngine().getMileage());

    }

}