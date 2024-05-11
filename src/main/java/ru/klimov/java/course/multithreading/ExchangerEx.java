package ru.klimov.java.course.multithreading;

import java.util.List;
import java.util.concurrent.Exchanger;

import static ru.klimov.java.course.multithreading.Action.*;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger =  new Exchanger<>();
        new BestFriends("Igor", List.of(STONE, SCISSORS, PAPER), exchanger);
        new BestFriends("Ivan", List.of(PAPER, STONE, STONE), exchanger);
    }
}


enum Action {
    STONE,
    PAPER,
    SCISSORS
}

class BestFriends extends Thread {
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriends(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    public void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.PAPER && friendAction == STONE) ||
                (myAction == STONE && friendAction == Action.SCISSORS) ||
                (myAction == Action.SCISSORS && friendAction == Action.PAPER)) {
            System.out.println("Победил " + name);
        }
    }

    @Override
    public void run() {
        Action replay;
        for (Action action : myAction) {
            try {
                replay = exchanger.exchange(action);
                whoWins(action, replay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
