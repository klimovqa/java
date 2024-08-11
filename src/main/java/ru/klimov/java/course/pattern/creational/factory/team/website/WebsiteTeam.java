package ru.klimov.java.course.pattern.creational.factory.team.website;

import ru.klimov.java.course.pattern.creational.factory.team.*;
import ru.klimov.java.course.pattern.creational.factory.team.banking.AnalystBank;
import ru.klimov.java.course.pattern.creational.factory.team.banking.JavaDeveloper;
import ru.klimov.java.course.pattern.creational.factory.team.banking.ProductManagerBank;
import ru.klimov.java.course.pattern.creational.factory.team.banking.TesterAQA;

public class WebsiteTeam implements ProjectTeamFactory {
    @Override
    public Analyst getAnalyst() {
        return new AnalystWebsite();
    }

    @Override
    public Designer getDesigner() {
        return new DesignerStaff();
    }

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProductManager getProductManager() {
        return new ProductManagerWebsite();
    }

    @Override
    public Tester getTester() {
        return new TesterQa();
    }
}
