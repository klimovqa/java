package ru.klimov.java.course.pattern.strategy;

public class CreditCardStrategy implements PayStrategy {
    @Override
    public double pay(double amount) {
        System.out.printf("Оплата с кредитной карты - %s. НДС 20%% - %s. Вознагрождение от банка - %s.\n",
                amount, amount * 0.2, amount * 0.02);
        return amount * 0.8 + amount * 0.02;
    }
}
