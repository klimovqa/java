package ru.klimov.java.course.lambda;

import ru.klimov.java.course.model.Department;
import ru.klimov.java.course.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {
    public static void main(String[] args) {
        Department it = new Department(3, "IT");
        Department hr = new Department(2, "HR");
        Department sales = new Department(1, "Sales");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Миша", "Григорьев", 25, 40000, sales));
        employees.add(new Employee(12, "Гриша", "Медведев", 31, 100000, it));
        employees.add(new Employee(44, "Анна", "Бутонова", 31, 56000, hr));
        employees.add(new Employee(44, "Татьяна", "Митрохина", 21, 50000, hr));
        employees.add(new Employee(22, "Иван", "Иван", 35, 300000, it));
        employees.add(new Employee(25, "Сергей", "Митрохин", 27, 230000, it));

        System.out.println(avgOfSmth(employees, student -> (double) student.getAge()));
    }

    public static double avgOfSmth(List<Employee> employees, Function<Employee, Double> function) {
        double result = 0;
        for (Employee emp : employees) {
            result += function.apply(emp);
        }
        result = result / employees.size();
        return result;
    }
}
