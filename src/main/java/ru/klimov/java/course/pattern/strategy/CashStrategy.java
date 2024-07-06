package ru.klimov.java.course.pattern.strategy;

public class CashStrategy implements PayStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Выполнен платеж наличными - " + df.format(amount) +
                " НДС 20% - " + df.format(amount * 0.2));
        return amount * 0.8;
    }
}
