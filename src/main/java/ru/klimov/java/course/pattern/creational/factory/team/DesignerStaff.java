package ru.klimov.java.course.pattern.creational.factory.team;

public class DesignerStaff implements Designer {
    @Override
    public void createDesign() {
        System.out.println("createDesign");
    }
}
