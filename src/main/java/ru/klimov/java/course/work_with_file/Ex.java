package ru.klimov.java.course.work_with_file;

public class Ex {
    public static void main(String[] args) {
        System.out.println(method());
    }

    static String method() {
        try {
            System.out.println("block try");
            return "String";
        } finally {
            System.out.println("block finally");
            return "String2";
        }
    }
}
