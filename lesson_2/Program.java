package ru.JDKitHW.lesson_2;
import static ru.JDKitHW.lesson_2.Developer.developGUI;

public class Program {

    public static void main(String[] args) {

        Developer javokhir = new Backender("Javokhir", 33);
        Developer anna = new Frontender("Anna", 30);
        Developer kristi = new FullStack("Kristina", 31);
        Developer artem = new Backender("Artem", 80);

        developGUI(javokhir);
        developGUI(anna);
        developGUI(kristi);
        developGUI(artem);
    }
}
