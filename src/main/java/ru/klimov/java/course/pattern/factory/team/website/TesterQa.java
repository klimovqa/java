package ru.klimov.java.course.pattern.factory.team.website;

import ru.klimov.java.course.pattern.factory.team.Tester;

public class TesterQa implements Tester {
    @Override
    public void testingCode() {
        System.out.println("Testing Code");
    }
}
