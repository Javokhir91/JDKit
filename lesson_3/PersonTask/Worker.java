package ru.JDKitHW.lesson_3.PersonTask;

public class Worker implements PersonInterface {
    @Override
    public void haveRest() {
        System.out.println("I always work");
    }
}
