package ru.klimov.java.course.pattern.behavioral.observer;

import ru.klimov.java.course.pattern.behavioral.observer.editor.Editor;
import ru.klimov.java.course.pattern.behavioral.observer.listeners.EmailNotificationListener;
import ru.klimov.java.course.pattern.behavioral.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
