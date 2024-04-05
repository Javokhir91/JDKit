package ru.JDKitHW.lesson_3.PersonTask;

public interface PersonInterface {
    default void doWork() {
        System.out.println("I'm working");
    }

    default void haveRest() {
        System.out.println("Do nothing");
    }
}