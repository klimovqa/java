package ru.klimov.java.course.collection.map;

import java.util.Objects;

public class HashMapEx2 {
    public static void main(String[] args) {
        System.out.println(1<<5);
    }
}

class Student {
    String name;
    String surname;
    Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(surname, student.surname)) return false;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
