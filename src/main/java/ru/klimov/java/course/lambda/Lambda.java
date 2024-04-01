package ru.klimov.java.course.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        Student s1 = new Student("Mark", 18, 2);
        Student s2 = new Student("Oleg", 22, 4);
        Student s3 = new Student("Inna", 19, 2);
        Student s4 = new Student("Katy", 21, 3);
        Student s5 = new Student("Sacha", 17, 1);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.viewCondition(students, s -> s.getAge() > 20);
        System.out.println("---------------------");
        studentInfo.viewCondition(students, s -> s.getCourse() < 3);
        System.out.println("---------------------");
        System.out.println(students);
        students.sort((st1, st2) -> {
            int compared = st1.getAge().compareTo(st2.getAge());
            return compared != 0 ? compared : st1.getName().compareTo(st2.getName());
        });

        System.out.println("---------------------");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));
    }
}


class StudentInfo {
    public void viewCondition(List<Student> students, ConditionView condition) {
        for (Student st : students) {
            if (condition.check(st)) {
                System.out.println(st);
            }
        }
    }
}

class Student {
    private String name;
    private Integer age;
    private Integer course;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCourse() {
        return course;
    }

    public Student(String name, Integer age, Integer course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}

interface ConditionView {
    boolean check(Student student);
}
