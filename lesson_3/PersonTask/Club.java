package ru.JDKitHW.lesson_3.PersonTask;
import java.util.NoSuchElementException;

/**
 * Объявляем обобщенный класс Club с типом Т, реализующим PersonInterface
 * @param <T> Массив с типом Т
 */
public class Club<T extends PersonInterface> {
    T[] arrayT;

    public Club(T[] arrayT) {
        this.arrayT = arrayT;
    }

    /**
     * Метод коротый вызывает класс MyIterator
     */
    public void start() {
        MyIterator myiterator = new MyIterator();
        while (myiterator.hasNext()){
            myiterator.next().haveRest();
        }
    }

    /**
     * Создал внутренный класс MyIterator с методом hasNext() и  next()
     */
    private class MyIterator{

        private int currentIndex = 0;

        public boolean hasNext() {
            if (currentIndex < arrayT.length && arrayT[currentIndex] != null) {
                return true;
            }
            return false;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return arrayT[currentIndex++];
        }

    }
}