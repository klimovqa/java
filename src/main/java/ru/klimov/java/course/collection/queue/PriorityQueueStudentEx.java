package ru.klimov.java.course.collection.queue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueStudentEx {
    public static void main(String[] args) {
        Student st1 = new Student("Masha", 18);
        Student st2 = new Student("Sasha", 21);
        Student st3 = new Student("Micha", 19);
        Student st4 = new Student("Olga", 17);
        Student st5 = new Student("Oleg", 23);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator());
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

    }
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
