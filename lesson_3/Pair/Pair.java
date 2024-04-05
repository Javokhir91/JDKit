package ru.JDKitHW.lesson_3.Pair;

public class Pair<T, S> {
    private T first;
    private S second;
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<Double, String> p = new Pair<>(2.2, "second");
//        System.out.println(p);
        System.out.println("firsts value: " + p.getFirst() + "\nSecond value: " + p.getSecond());
    }

}
