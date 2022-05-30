package collections.iterator.array;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T>{
    private int size;
    private int capacity;
    private Object[]array;

    public MyArrayList() {
        capacity = 10;
        array = new Object[capacity];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<T> {
        int cursor;
        int lastReturned;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            if(cursor >= size) {
                throw new NoSuchElementException();
            }
            lastReturned = cursor++;
            return (T)MyArrayList.this.array[lastReturned];
        }

        public void remove() {
            if(lastReturned < 0) {
                throw new IllegalStateException();
            }
            MyArrayList.this.remove(lastReturned);
            cursor = lastReturned;
            lastReturned = -1;
        }
    }

    public void addFirst(T element) {
        if(size == capacity) {
            grow();
        }

        shiftRight(0);
        array[0] = element;
        size++;
    }

    public void add(T element, int index) {
        if(index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        if(size == capacity) {
            grow();
        }
        shiftRight(index);
        array[index] = element;
        size++;
    }

    public void addLast(T element) {
        if (size == capacity) {
            grow();
        }
        array[size++] = element;
    }

    public void remove(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        shiftLeft(index);
        size--;
    }

    private void grow() {
        this.capacity *= 2;
        Object[]newArray = new Object[capacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void shiftRight(int index) {
        if (size - index >= 0) System.arraycopy(array, index, array, index + 1, size - index);
    }

    private void shiftLeft(int index) {
        if (size - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, size - 1 - index);
    }
}
