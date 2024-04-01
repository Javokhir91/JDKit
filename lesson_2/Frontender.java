package ru.JDKitHW.lesson_2;

public class Frontender extends Developer implements FrontendDabble, BackendDabble{
    public Frontender(String name, int age) {
        super(name, age);
    }


    @Override
    public void doFrontenderWork() {
        System.out.println("Good frontend work!");
    }

    @Override
    public void doBackenderWork() {
        System.out.println("BAD backend work!");
    }

//    @Override
//    public void developGUI(Developer developer) {
//        doFrontenderWork();
//    }

    @Override
    public String toString() {
        return "name: " + getName() + ", age: " + getAge();
    }
}
