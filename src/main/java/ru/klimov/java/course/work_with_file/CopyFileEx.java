package ru.klimov.java.course.work_with_file;

import java.io.*;

public class CopyFileEx {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("copy_text.txt"))) {

            reader.lines().forEach(line -> {
                try {
                    writer.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
