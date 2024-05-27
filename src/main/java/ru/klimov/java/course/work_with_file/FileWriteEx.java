package ru.klimov.java.course.work_with_file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {
        String text = """
                Октябрь уж наступил — уж роща отряхает
                Последние листы с нагих своих ветвей;
                Дохнул осенний хлад — дорога промерзает.
                Журча еще бежит за мельницу ручей,
                Но пруд уже застыл; сосед мой поспешает
                В отъезжие поля с охотою своей,
                И страждут озими от бешеной забавы,
                И будит лай собак уснувшие дубравы.
                """;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("text.txt");
            //for (int i = 0; i < text.length(); i++) {
                //fileWriter.write(text.charAt(i));
                fileWriter.write(text);
           // }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Objects.requireNonNull(fileWriter).close();
        }
    }
}
