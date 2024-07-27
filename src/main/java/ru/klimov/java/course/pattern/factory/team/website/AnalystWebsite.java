package ru.klimov.java.course.pattern.factory.team.website;

import ru.klimov.java.course.pattern.factory.team.Analyst;

public class AnalystWebsite implements Analyst {
    @Override
    public void writeSpecification() {
        System.out.println("Analyst website write specification");
    }
}
