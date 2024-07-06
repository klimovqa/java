package ru.klimov.java.course.pattern.strategy;

public class CardStrategy implements PayStrategy {
    @Override
    public double pay(double amount) {
        System.out.printf("Оплата с карты - %sр. НДС 20%% - %sр. Коммисия банку - %sр.\n",
                amount, amount * 0.2, amount * 0.01);
        return amount * 0.8 - amount * 0.01;
    }
}
