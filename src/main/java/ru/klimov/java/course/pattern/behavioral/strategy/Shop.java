package ru.klimov.java.course.pattern.behavioral.strategy;

import java.text.DecimalFormat;

public class Shop {

    private static double revenue = 0;
    private static double profit = 0;
    private static int countPay = 0;

    private PayStrategy payStrategy;

    public Shop(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void displayTotalSum() {
        DecimalFormat df = new DecimalFormat("#0.00р");
        System.out.println("--------------------------------------------");
        System.out.println("Выручка магазина составила : " + df.format(revenue));
        System.out.println("Прибыль магазина составила : " + df.format(profit));
    }

    public void buy(double price) {
        countPay++;
        //System.out.println("Транзакция - " + countPay);
        revenue += price;
        profit += payStrategy.pay(price);
    }
}
