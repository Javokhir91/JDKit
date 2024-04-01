package ru.JDKitHW.lesson_2;

public abstract class Developer{
    String name;
    int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void developGUI(Developer developer) {
        if (developer instanceof Frontender){
            ((Frontender) developer).doFrontenderWork();
        } else if (developer instanceof Backender) {
            ((Backender) developer).doBackenderWork();
        } else if (developer instanceof FullStack) {
            ((FullStack) developer).allOverride();
        }
        else System.out.println("Is no such worker!");
    }

}
