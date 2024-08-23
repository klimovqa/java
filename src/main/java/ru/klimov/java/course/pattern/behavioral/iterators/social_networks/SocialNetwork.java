package ru.klimov.java.course.pattern.behavioral.iterators.social_networks;

import ru.klimov.java.course.pattern.behavioral.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
