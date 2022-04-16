package generics;

public class MyArrayList <T>{
    private T[] array;
    private int size;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public void addElement(T element) {
        if(size >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        array[size] = element;
        size++;
    }

    public void removeElement(int index) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        for(int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void removeFirstElement() {
        for(int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public T getElement(int index) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        return array[index];
    }

    public void changeElement(int index, T element) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        array[index] = element;
    }
}
