package ru.klimov.java.course.pattern.factory.team.banking;

import ru.klimov.java.course.pattern.factory.team.Analyst;

public class AnalystBank implements Analyst {
    @Override
    public void writeSpecification() {
        System.out.println("Analyst Bank write specification");
    }
}
