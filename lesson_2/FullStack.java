package ru.JDKitHW.lesson_2;

public class FullStack extends Developer implements FrontendDabble, BackendDabble{
    public FullStack(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackenderWork() {
    }

    @Override
    public void doFrontenderWork() {
    }

    public void allOverride(){
        doBackenderWork();
        doFrontenderWork();
        System.out.println("Good All work !!");
    }


    @Override
    public String toString() {
        return "name: " + getName() + ", age: " + getAge();
    }
}
