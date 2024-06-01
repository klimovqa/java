package ru.klimov.java.course.work_with_file.programmer1;

import java.io.*;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) throws IOException {
        List<String> list = List.of("Max", "Andrei", "Oleg");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee1.bin"))) {
            outputStream.writeObject(list);
            System.out.println("Done!");
        }
    }
}
