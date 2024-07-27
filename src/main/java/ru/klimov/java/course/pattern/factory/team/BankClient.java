package ru.klimov.java.course.pattern.factory.team;

import ru.klimov.java.course.pattern.factory.team.banking.BankTeam;


public class BankClient {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeam();
        Analyst analyst = projectTeamFactory.getAnalyst();
        Designer designer = projectTeamFactory.getDesigner();
        ProductManager productManager = projectTeamFactory.getProductManager();
        Tester tester = projectTeamFactory.getTester();
        Developer developer = projectTeamFactory.getDeveloper();

        productManager.manageProduct();
        analyst.writeSpecification();
        designer.createDesign();
        developer.writeCode();
        tester.testingCode();
    }
}
