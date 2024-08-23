package ru.klimov.java.course.pattern.behavioral.iterators;


import ru.klimov.java.course.pattern.behavioral.iterators.profile.Profile;
import ru.klimov.java.course.pattern.behavioral.iterators.social_networks.Facebook;
import ru.klimov.java.course.pattern.behavioral.iterators.social_networks.LinkedIn;
import ru.klimov.java.course.pattern.behavioral.iterators.social_networks.SocialNetwork;
import ru.klimov.java.course.pattern.behavioral.iterators.spammer.SocialSpammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        List<Profile> data = createTestProfiles();
        if (choice.equals("2")) {
            network = new LinkedIn(data);
        }
        else {
            network = new Facebook(data);
        }

        SocialSpammer spammer = new SocialSpammer(network);
        for (Profile profile : data) {
            spammer.sendSpamToFriends(profile.getEmail(),
                    "Hey! This is " + profile.getName() + " friend Josh. Can you do me a favor and like this post [link]?");
            spammer.sendSpamToCoworkers(profile.getEmail(),
                    "Hey! This is  " + profile.getName() + "  boss Jason. Anna told me you would be interested in [link].");
            System.out.println("------------------------------------------------");
        }
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
