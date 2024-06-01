package ru.klimov.java.course.work_with_file.programmer1;

import ru.klimov.java.course.model.Department;
import ru.klimov.java.course.model.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(1, "Ivan", "Ivanov",25, 100000,
                new Department(1, "IT"));
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee2.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        }
    }
}
