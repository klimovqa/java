package ru.klimov.java.course.pattern.behavioral.visitor.shapes;

import ru.klimov.java.course.pattern.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
