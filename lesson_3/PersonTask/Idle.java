package ru.JDKitHW.lesson_3.PersonTask;

public class Idle implements PersonInterface {
    @Override
    public void doWork() {
        System.out.println("I can't work");
    }
}