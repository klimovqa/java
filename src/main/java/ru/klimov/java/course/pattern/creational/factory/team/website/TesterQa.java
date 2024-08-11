package ru.klimov.java.course.pattern.creational.factory.team.website;

import ru.klimov.java.course.pattern.creational.factory.team.Tester;

public class TesterQa implements Tester {
    @Override
    public void testingCode() {
        System.out.println("Testing Code");
    }
}
