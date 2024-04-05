package ru.JDKitHW.lesson_3.compareArrays;

/*
    Напишите обобщенный метод compareArrays(), который принимает два массива и
    возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
    любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
    типа.
 */
public class CompareArrays {

    static <T> boolean compareArrays(T[] arr1, T[] arr2) {

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5"};
        String[] arr2 = {"1", "2", "3", "4", "5"};
        Integer[] arr3 = {1, 2, 3, 4, 5};
        Integer[] arr4 = {1, 2, 3, 4, 5};

        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr2, arr3));
        System.out.println(compareArrays(arr3, arr4));
        System.out.println(compareArrays(arr4, arr1));

    }

}
