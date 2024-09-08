package ru.klimov.java.course.pattern.behavioral.visitor.visitor;


import ru.klimov.java.course.pattern.behavioral.visitor.shapes.Circle;
import ru.klimov.java.course.pattern.behavioral.visitor.shapes.CompoundShape;
import ru.klimov.java.course.pattern.behavioral.visitor.shapes.Dot;
import ru.klimov.java.course.pattern.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
