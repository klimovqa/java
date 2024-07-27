package ru.klimov.java.course.pattern.factory.team.website;


import ru.klimov.java.course.pattern.factory.team.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer written php code");
    }
}
