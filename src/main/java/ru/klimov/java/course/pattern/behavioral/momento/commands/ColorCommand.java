package ru.klimov.java.course.pattern.behavioral.momento.commands;

import ru.klimov.java.course.pattern.behavioral.momento.editor.Editor;
import ru.klimov.java.course.pattern.behavioral.momento.shapes.Shape;

import java.awt.*;


public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
