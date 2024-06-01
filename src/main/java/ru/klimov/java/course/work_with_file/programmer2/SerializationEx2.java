package ru.klimov.java.course.work_with_file.programmer2;

import ru.klimov.java.course.model.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee2.bin"))) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        }
    }
}
