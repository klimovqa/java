package ru.klimov.java.course.pattern.behavioral.strategy;

import java.text.DecimalFormat;

public interface PayStrategy {
    DecimalFormat df = new DecimalFormat("#0.00р");

    double pay(double amount);
}
