package ru.klimov.java.course.pattern.behavioral.momento.history;


import ru.klimov.java.course.pattern.behavioral.momento.editor.Editor;

public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
