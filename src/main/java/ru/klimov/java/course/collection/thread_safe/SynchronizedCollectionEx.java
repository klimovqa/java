package ru.klimov.java.course.collection.thread_safe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SynchronizedCollectionEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            source.add(i);
        }
        //ArrayList<Integer> target = new ArrayList<>();
        Collection<Object> synchronizedCollection = Collections
                .synchronizedCollection(new ArrayList<>());
        Runnable runnable = () -> {synchronizedCollection.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizedCollection);
     }
}
