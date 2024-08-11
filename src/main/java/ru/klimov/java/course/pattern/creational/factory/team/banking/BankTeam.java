package ru.klimov.java.course.pattern.creational.factory.team.banking;

import ru.klimov.java.course.pattern.creational.factory.team.*;

public class BankTeam implements ProjectTeamFactory {
    @Override
    public Analyst getAnalyst() {
        return new AnalystBank();
    }

    @Override
    public Designer getDesigner() {
        return new DesignerStaff();
    }

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProductManager getProductManager() {
        return new ProductManagerBank();
    }

    @Override
    public Tester getTester() {
        return new TesterAQA();
    }
}
