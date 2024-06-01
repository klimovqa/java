package ru.klimov.java.course.work_with_file.programmer2;

import java.io.*;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> list;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee1.bin"))) {
            list = (List<String>) inputStream.readObject();
            System.out.println(list);
        }
    }
}
