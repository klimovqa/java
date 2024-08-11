package ru.klimov.java.course.pattern.behavioral.command.editor.commands;

import ru.klimov.java.course.pattern.behavioral.command.editor.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
