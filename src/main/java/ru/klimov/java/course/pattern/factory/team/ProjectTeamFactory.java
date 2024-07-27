package ru.klimov.java.course.pattern.factory.team;

public interface ProjectTeamFactory {
    Analyst getAnalyst();
    Designer getDesigner();
    Developer getDeveloper();
    ProductManager getProductManager();
    Tester getTester();
}
