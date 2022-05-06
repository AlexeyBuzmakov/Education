package collections.list;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayList <T> implements List<T> {
    private Object[]array;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = 10;
        this.array = new Object[capacity];
    }

    @Override
    public void addFirst(T element) {
        if(size == capacity) {
           grow();
        }
        shiftRight(0);
        array[0] = element;
        size++;
    }

    @Override
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


    @Override
    public void addLast(T element) {
        if (size == capacity) {
            grow();
        }
        array[size++] = element;
    }

    @Override
    public void addAll(List<T>list) {
        int i = 0;
        while(i < list.size()) {
            addLast(list.get(i));
            i++;
        }
    }

    @Override
    public void removeFirst() {
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов для удаления");
        }
        shiftLeft(0);
        size--;
    }

    @Override
    public void remove(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        shiftLeft(index);
        size--;
    }

    @Override
    public void removeLast() {
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов для удаления");
        }
        size--;
    }

    @Override
    public void removeElement(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
            }
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        return (T)array[index];
    }

    @Override
    public void set(T element,int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        array[index] = element;
    }

    @Override
    public boolean find(T element) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void sort(Comparator<T> comparator) {
        T buf;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(comparator.compare((T) array[i], (T) array[j]) > 0) {
                   buf = (T)array[i];
                   array[i] = array[j];
                   array[j] = buf;
                }
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("all")
    public T[] toArray(T[]arr) {
        if (arr.length < size)
        return (T[]) Arrays.copyOf(array, size, arr.getClass());
        System.arraycopy(array, 0, arr, 0, size);
        if (arr.length > size)
            arr[size] = null;
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public void ensureCapacity(int capacity) {
        if (capacity <= size) {
            throw new IllegalArgumentException("Вместимость не может быть меньше фактической длины массива");
        }
        Object[] newArray = new Object[capacity];
        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
        this.capacity = capacity;
        array = newArray;
    }

    public void trimToSize() {
        Object[]newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        capacity = size;
    }

    public void push(T element) {
       addLast(element);
    }

    public T pop() {
        T buf = get(size--);
        removeLast();
        return buf;
    }

    public T peek() {
        return get(size--);
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
