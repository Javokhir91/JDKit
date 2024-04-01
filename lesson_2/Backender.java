package ru.JDKitHW.lesson_2;

public class Backender extends Developer implements BackendDabble, FrontendDabble{

    public Backender(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackenderWork() {
        System.out.println("Good backend work!");
    }

    @Override
    public void doFrontenderWork() {
        System.out.println("BAD frontend work!");
    }

//    @Override
//    public void developGUI(Developer developer) {
//        doBackenderWork();
//    }

    @Override
    public String toString() {
        return "name: " + getName() + ", age: " + getAge();
    }
}
