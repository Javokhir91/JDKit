package ru.JDKitHW.lesson_3.PersonTask;

import java.util.NoSuchElementException;

public class Workplace<T extends PersonInterface> {
    T[] arrayT;

    public Workplace(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public void start() {
        MyIterator myiterator = new MyIterator();
        while (myiterator.hasNext()){
            myiterator.next().doWork();
        }
    }

    /**
     * Все тоде самое что в Клубе ))
     */
    private class MyIterator {

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
