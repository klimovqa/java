package ru.klimov.java.course.generics.game.logic;

import ru.klimov.java.course.generics.game.model.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants;

    public Team(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
    }

    public void addNewParticipant(T... participant) {
        for (T p : participant) {
            participants.add(p);
            System.out.printf("'%s' was added to the '%s' team%n", p.getName(), this.name);
        }
    }

    public void playWith(Team<T> team) {
        int i = new Random().nextInt(2);
        String winnerName = i == 0 ? this.name : team.name;
        System.out.println("-------------------------------");
        System.out.printf("The '%s' team won", winnerName);
        System.out.println("\n-------------------------------");
    }
}
