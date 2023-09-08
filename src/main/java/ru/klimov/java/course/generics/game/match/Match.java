package ru.klimov.java.course.generics.game.match;

import ru.klimov.java.course.generics.game.logic.Team;
import ru.klimov.java.course.generics.game.model.Employee;
import ru.klimov.java.course.generics.game.model.Scholar;
import ru.klimov.java.course.generics.game.model.Student;

public class Match {


    public static void main(String[] args) {
        Scholar sc1 = new Scholar("Egor", 13);
        Scholar sc2 = new Scholar("Marina", 12);

        Scholar sc3 = new Scholar("Max", 11);
        Scholar sc4 = new Scholar("Gena", 14);

        Student st1 = new Student("Misha", 20);
        Student st2 = new Student("Timur", 21);

        Employee em1 = new Employee("Grigory", 44);
        Employee em2 = new Employee("Valentina", 35);

        Team<Scholar> scholarTeam = new Team<>("Red Dogs");
        scholarTeam.addNewParticipant(sc1, sc2);
        Team<Scholar> scholarTeam2 = new Team<>("White Cat");
        scholarTeam.addNewParticipant(sc3, sc4);

        Team<Student> studentTeam = new Team<>("Bear");
        studentTeam.addNewParticipant(st1, st2);

        Team<Employee> employeeTeam = new Team<>("Employee");
        employeeTeam.addNewParticipant(em1, em2);

        scholarTeam2.playWith(scholarTeam);

    }


}
