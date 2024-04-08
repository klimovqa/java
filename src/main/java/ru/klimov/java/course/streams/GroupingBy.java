package ru.klimov.java.course.streams;

import ru.klimov.java.course.model.Employee;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee(23, "Миша", "Григорьев",25, 40000, "it"));
        employees.add(new Employee(12, "Гриша", "Медведев",31, 100000,"sales"));
        employees.add(new Employee(44, "Анна", "Бутонова", 31,56000,"it"));
        employees.add(new Employee(44, "Татьяна", "Митрохина",21, 50000,"hr"));
        employees.add(new Employee(22, "Иван", "Иван", 35,300000,"it"));
        employees.add(new Employee(25, "Сергей", "Митрохин",27, 230000, "hr"));

        Map<String, List<Employee>> group = employees.stream()
                .peek(emp -> emp.setName(emp.getName().toUpperCase()))
                .collect(Collectors.groupingBy(Employee::getDep));
        System.out.println(group);

        Map<Boolean, List<Employee>> booleanListMap = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 60_000));
        System.out.println(booleanListMap);

        String collectStr = employees.stream().map(Employee::getSurname)
                .collect(Collectors.joining(",", "prefix_", "_suffix"));
        System.out.println(collectStr);

        Long count = employees.stream().collect(Collectors.counting());
        Long count2 = employees.stream().count();
        System.out.println(count);

        Integer totalSalary = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
        Integer totalSalary2 = employees.stream().mapToInt(Employee::getSalary).sum();

        IntSummaryStatistics totalSalary3 = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(totalSalary3.getMax());
        System.out.println(totalSalary);
        System.out.println(totalSalary2);

        Double avSalary = employees.stream().collect(Collectors.averagingInt(Employee::getSalary));
        Double avSalary2 = employees.stream().collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println(avSalary);

        List<Employee> collect = employees.stream().collect(Collectors.filtering(e -> e.getSalary() > 60000,
                Collectors.toList()));
        System.out.println(collect);
    }
}
