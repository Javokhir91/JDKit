package ru.JDKitHW.lesson_3.Calc;

/*
    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
    над которыми должна быть произведена операция.
 */
public class Calc {

    protected static <X extends Number, Y extends Number> double sum(X x, Y y) {
        return x.doubleValue() + y.doubleValue();
    }

    protected static <X extends Number, Y extends Number> double subtract(X x, Y y) {
        return x.doubleValue() - y.doubleValue();
    }

    protected static <X extends Number, Y extends Number> double multiply(X x, Y y) {
        return x.doubleValue() - y.doubleValue();
    }

    protected static <X extends Number, Y extends Number> double divide(X x, Y y) {
        if (x.doubleValue() == 0 && y.doubleValue() == 0) {
            System.out.println("На ноль делить нельзя");
        }
        return x.doubleValue() / y.doubleValue();
    }

}



