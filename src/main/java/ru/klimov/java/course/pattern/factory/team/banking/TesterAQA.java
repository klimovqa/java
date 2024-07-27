package ru.klimov.java.course.pattern.factory.team.banking;

import ru.klimov.java.course.pattern.factory.team.Tester;

public class TesterAQA implements Tester {
    @Override
    public void testingCode() {
        System.out.println("AQA writing tests");
    }
}
