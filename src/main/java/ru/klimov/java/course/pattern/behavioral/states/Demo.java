package ru.klimov.java.course.pattern.behavioral.states;

import ru.klimov.java.course.pattern.behavioral.states.ui.Player;
import ru.klimov.java.course.pattern.behavioral.states.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
