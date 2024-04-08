package ru.klimov.java.course.streams;

import ru.klimov.java.course.model.Department;
import ru.klimov.java.course.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        Department it = new Department(3, "IT");
        Department hr = new Department(2, "HR");
        Department sales = new Department(1, "Sales");
        List<Employee> itDep= new ArrayList<>();
        List<Employee> itHr= new ArrayList<>();
        List<Employee> itSales= new ArrayList<>();
        itDep.add(new Employee(23, "Миша", "Григорьев",25, 40000));
        itDep.add(new Employee(12, "Гриша", "Медведев",31, 100000));
        itDep.add(new Employee(44, "Анна", "Бутонова", 31,56000));
        itHr.add(new Employee(44, "Татьяна", "Митрохина",21, 50000));
        itHr.add(new Employee(22, "Иван", "Иван", 35,300000));
        itSales.add(new Employee(25, "Сергей", "Митрохин",27, 230000));
        it.setEmployees(itDep);
        hr.setEmployees(itHr);
        sales.setEmployees(itSales);
        List<Department> departments = new ArrayList<>();
        departments.add(it);
        departments.add(hr);
        departments.add(sales);

        departments.stream().filter(dep -> dep.getName().equals("IT"))
                .peek(System.out::println)
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }
}
