package ru.klimov.java.course.assertj;

import org.assertj.core.api.Assertions;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Ivanov");
        Student st2 = new Student("Ivan", "Sidorov");
        Student st3 = new Student("Petr", "Petrov");
        Student st4 = new Student("Petr", "Petrov", new Book("book1", 1965));
        Student st5 = new Student("Ivan", "Petrov", new Book("book2", 1964));

        assertThat(st4).usingRecursiveComparison().isEqualTo(st5);

    }
}

class Student{
    String name;
    String surname;

    Book book;

    public Student(String name, String surname, Book book) {
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", book=" + book +
                '}';
    }
}

class Book {
    String name;
    int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
