package generics;

public class MyArrayList <T>{
    private T[] array;
    private int size;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public void addElementArray (T element) {
        if(size >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        array[size] = element;
        size++;
    }

    public void removeElementArray(int index) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        array[index] = null;
    }

    public void removeFirstElementArray() {
        array[0] = null;
    }

    public T getElementArray(int index) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        return array[index];
    }

    public void changeElementArray(int index, T element) {
        if(index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Введённый индекс выходит за пределы длины массива");
        }
        array[index] = element;
    }
}
