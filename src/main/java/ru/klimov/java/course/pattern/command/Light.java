package ru.klimov.java.course.pattern.command;
/*Receiver class*/

public class Light{
    public Light(){  }

    public void turnOn(){
        System.out.println("The light is on");
    }

    public void turnOff(){
        System.out.println("The light is off");
    }
}
