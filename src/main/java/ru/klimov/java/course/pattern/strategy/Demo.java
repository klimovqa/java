package ru.klimov.java.course.pattern.strategy;

public class Demo {
    public static void main(String[] args) {
        CardStrategy cardStrategy = new CardStrategy();
        CashStrategy cashStrategy = new CashStrategy();
        CreditCardStrategy creditCardStrategy = new CreditCardStrategy();
        SbpStrategy sbpStrategy = new SbpStrategy();
        Shop shop = new Shop(cashStrategy);
        shop.buy(100.0);

        shop.setPayStrategy(cardStrategy);
        shop.buy(100.0);

        shop.setPayStrategy(creditCardStrategy);
        shop.buy(250.5);

        shop.setPayStrategy(creditCardStrategy);
        shop.buy(500);

        shop.setPayStrategy(sbpStrategy);
        shop.buy(700);

        shop.displayTotalSum();
    }
}
