package ru.klimov.java.course.pattern.behavioral.mediator.components;

import ru.klimov.java.course.pattern.behavioral.mediator.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
