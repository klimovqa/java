package ru.klimov.java.course.pattern.behavioral.momento;

import ru.klimov.java.course.pattern.behavioral.momento.editor.Editor;
import ru.klimov.java.course.pattern.behavioral.momento.shapes.Circle;
import ru.klimov.java.course.pattern.behavioral.momento.shapes.CompoundShape;
import ru.klimov.java.course.pattern.behavioral.momento.shapes.Dot;
import ru.klimov.java.course.pattern.behavioral.momento.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}