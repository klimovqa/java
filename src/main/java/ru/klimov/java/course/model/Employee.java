package ru.klimov.java.course.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@ToString
@EqualsAndHashCode
@Data
public class Employee implements Serializable {

    Integer id;
    String name;
    String surname;
    Integer age;
    String dep;
    transient Integer salary;
    Department department;

    public Employee(Integer id, String name, String surname, Integer age, Integer salary, Department department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public Employee(Integer id, String name, String surname, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
    public Employee(Integer id, String name, String surname, Integer age, Integer salary, String dep) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
    }
}
