package ru.klimov.java.course.comparation;

import ru.klimov.java.course.comparation.model.Department;
import ru.klimov.java.course.comparation.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static ru.klimov.java.course.until.Helper.print;


public class ComparatoreEmployeeTest {

    public static void main(String[] args) {
        Department it = new Department(3, "IT");
        Department hr = new Department(2, "HR");
        Department sales = new Department(1, "Sales");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Миша", "Григорьев",25, 40000, sales));
        employees.add(new Employee(12, "Гриша", "Медведев",31, 100000, it));
        employees.add(new Employee(44, "Анна", "Бутонова", 31,56000, hr));
        employees.add(new Employee(44, "Татьяна", "Митрохина",21, 50000, hr));
        employees.add(new Employee(22, "Иван", "Иван", 35,300000, it));
        employees.add(new Employee(25, "Сергей", "Митрохин",27, 230000, it));

        print(employees, "Исходный list");

        employees.sort(Comparator.comparing(Employee::getName));
        print(employees, "Сортировка по имени сотрудника");

        employees.sort(Comparator.comparing(Employee::getName).reversed());
        print(employees, "Сортировка по имени сотрудника reversed");

        Collections.sort(employees, Comparator.comparingInt(Employee::getAge).reversed()
                .thenComparing(Employee::getSurname));
        print(employees, "Сортировка по возрасту сотрудника reversed, если совпадает доп. сортировка по фамилии");

        employees.sort(Comparator.comparing(Employee::getDepartment));
        print(employees, "Сортировка сотрудников по департаменту, сортировка департамента идет по названию");

        employees.sort(Comparator.comparing(Employee::getDepartment).reversed());
        print(employees, "Сортировка сотрудников по департаменту, сортировка департамента идет по названию reversed");
    }

}
