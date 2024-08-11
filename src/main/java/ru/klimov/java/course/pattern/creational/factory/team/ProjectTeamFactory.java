package ru.klimov.java.course.pattern.creational.factory.team;

public interface ProjectTeamFactory {
    Analyst getAnalyst();
    Designer getDesigner();
    Developer getDeveloper();
    ProductManager getProductManager();
    Tester getTester();
}
