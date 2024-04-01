package ru.klimov.java.course.nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    private static int countCar = 0;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        countCar++;
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void countEngine(){
        System.out.println(Engine.count);
    }

    public static class Engine {
        private int horsePower;

        private static int count = 0;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            count++;
        }

        void countCar(){
            System.out.println(countCar);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(101);
        System.out.println(engine);
        Car car = new Car("black", 4, engine);
        System.out.println(car);
        Car car2 = new Car("red", 2, new Car.Engine(123));
        System.out.println(car2);
        car.countEngine();
        car.engine.countCar();
        car2.countEngine();
        car2.engine.countCar();
    }
}
