package ru.klimov.java.course.generics;

import ru.klimov.java.course.model.Department;
import ru.klimov.java.course.model.Employee;

public class ParameterizedClass {
    public static void main(String[] args) {
        System.out.println(new Info<>("hello"));
        System.out.println(new Info<>(78));
        System.out.println(new Info<>(new Employee(5,"Миша", "Климов", 30, 5000, new Department(2, "IT"))));
    }
}

class Info <T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
