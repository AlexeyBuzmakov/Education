package collections.list;

import java.util.Arrays;

public class Stack<T> extends Vector<T>{

    private Object[]array;
    private int capacity;
    private int tail;

    public Stack() {
        capacity = 10;
        array = new Object[capacity];
    }

    @Override
    public void push(T element) {
        if(tail == capacity) {
            capacity *= 2;
            Object[]newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[tail++] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pull() {
        if(isEmpty()) {
            return null;
        }
        tail--;
        Object buf = array[tail];
        array[tail] = null;
        return (T) buf;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return (T)array[tail - 1];
    }

    private boolean isEmpty() {
        return tail == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(printStack());
    }

    private Object[] printStack() {
        Object[]stack = new Object[tail];
        int i = 0;
        while(peek() != null) {
            stack[i] = peek();
            i++;
            pull();
        }
        return stack;
    }
}
