package ru.klimov.java.course.collection.linkedList;

public class SingleListTest {

    public static void main(String[] args) {
        MainSingleList<Integer> mainSingleList = new MainSingleList<>();
        mainSingleList.addToEnd(1);
        mainSingleList.addToEnd(2);
        mainSingleList.addToEnd(3);
        mainSingleList.addToEnd(4);
        mainSingleList.addToEnd(5);
        mainSingleList.addToEnd(6);
        mainSingleList.add(4, 10);


        System.out.println("Size before: " + mainSingleList.size());

        mainSingleList.remove(4);
        mainSingleList.remove(5);

        System.out.println("Size after: " + mainSingleList.size());

        mainSingleList.forEach(System.out::println);
        System.out.println("-------reverse list--------");
        mainSingleList.reverse();
        mainSingleList.forEach(System.out::println);
    }

}
