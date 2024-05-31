package ru.klimov.java.course.work_with_file;

import java.io.*;

public class CopyImageEx {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\Medved\\Downloads\\img.jpg"));
             BufferedOutputStream ou = new BufferedOutputStream(new FileOutputStream("img.jpg"))) {

            ou.write(in.readAllBytes());
            System.out.println("Done!");
        }
    }
}
