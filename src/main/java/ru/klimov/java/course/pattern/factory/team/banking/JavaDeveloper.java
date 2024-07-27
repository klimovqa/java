package ru.klimov.java.course.pattern.factory.team.banking;


import ru.klimov.java.course.pattern.factory.team.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer written java code");
    }
}
