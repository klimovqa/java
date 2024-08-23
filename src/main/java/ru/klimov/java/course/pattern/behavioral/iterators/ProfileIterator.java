package ru.klimov.java.course.pattern.behavioral.iterators;

import ru.klimov.java.course.pattern.behavioral.iterators.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
