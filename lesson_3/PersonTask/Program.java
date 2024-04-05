package ru.JDKitHW.lesson_3.PersonTask;

/*
    Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
    чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */



public class Program {
    public static void main(String[] args) {
        PersonInterface[] persons = {new Worker(), new Idle(), new Worker(), new Worker()};
        Workplace<PersonInterface> workplace = new Workplace<>(persons);

        Club<PersonInterface> club = new Club<>(persons);
        workplace.start();
        club.start();


    }
}
