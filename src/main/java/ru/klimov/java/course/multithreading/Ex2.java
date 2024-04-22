package ru.klimov.java.course.multithreading;

public class Ex2 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Поток 2");
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Поток 1");
        }
    }
}
