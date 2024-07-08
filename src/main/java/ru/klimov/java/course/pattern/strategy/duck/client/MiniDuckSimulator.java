package ru.klimov.java.course.pattern.strategy.duck.client;

import ru.klimov.java.course.pattern.strategy.duck.Duck;
import ru.klimov.java.course.pattern.strategy.duck.MallardDuck;
import ru.klimov.java.course.pattern.strategy.duck.ModelDuck;
import ru.klimov.java.course.pattern.strategy.duck.behavior.imp.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
