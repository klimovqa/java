package ru.klimov.java.course.pattern.behavioral.strategy;

public class SbpStrategy implements PayStrategy {
    @Override
    public double pay(double amount) {
        System.out.printf("Оплата через СБП - %sр. НДС 18%% - %sр.\n",
                amount, amount * 0.18);
        return amount * 0.82;
    }
}
