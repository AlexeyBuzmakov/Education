package collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList <T> {
    private Object[]array;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = 10;
        this.array = new Object[capacity];
    }

    public void addFirst(T element) {                                                 //2.1
        if(size == capacity) {
           grow();
        }
        shiftRight(0);
        array[0] = element;
        size++;
    }

    public void add(T element, int index) {                                           //2.2
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

    public void addLast(T element) {                                                  //2.3
        if (size == capacity) {
            grow();
        }
        array[size++] = element;
    }

    public void removeFirst() {                                                       //3.1
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов для удаления");
        }
        shiftLeft(0);
        size--;
    }

    public void remove(int index) {                                                   //3.2
        if(index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        shiftLeft(index);
        size--;
    }

    public void removeLast() {                                                        //3.3
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("Нет элементов для удаления");
        }
        size--;
    }

    public Object get(int index) {                                                    //4.1
        if(index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        return array[index];
    }

    public void set(T element,int index) {                                            //4.2
        if(index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        array[index] = element;
    }

    public boolean find(T element) {                                                  //5
        for(int i = 0; i < size; i++) {
            if(array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {                                                         //6.1
        Object[]newArray = new Object[size];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = size;
    }

    public void ensureCapacity(int capacity) {                                         //6.2
        if (capacity <= size) {
            throw new IllegalArgumentException("Вместимость не может быть меньше фактической длины массива");
        }
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        this.capacity = capacity;
        array = newArray;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {                                                            //7.1
        return (T[])array;
    }

    public void addAll(List<T> list) {                                                //7.2
       int newSize = size;
       int j = 0;
       for(int i = newSize; i < newSize + list.size(); i++) {
           if(capacity == size) {
               grow();
           }
           array[i] = list.get(j);
           size++;
           j++;
       }
    }

    public void sort() {                                                               //8
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException("Невозможно отсортировать пустой массив");
        }
        trimToSize();
        Arrays.sort(array);
    }

    private void grow() {
        this.capacity *= 2;
        Object[]newArray = new Object[capacity];
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void shiftRight(int index) {
       for(int i = size; i > index; i--) {
           array[i] = array[i - 1];
       }
    }

    private void shiftLeft(int index) {
        for(int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
