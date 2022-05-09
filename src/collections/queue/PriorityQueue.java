package collections.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PriorityQueue<T> implements Queue<T>{
    private Object[]array;
    private int capacity;
    private int tail;
    private int head;

    public PriorityQueue() {
        capacity = 10;
        array = new Object[capacity];
    }

    @Override
    public void offer(T element) {
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
        return (T)array[head++];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove() {
        if(isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return (T)array[head++];
    }

    @SuppressWarnings("unchecked")
    public T element() {
        if(isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return (T)array[head];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if(isEmpty()) {
            return null;
        }
        return (T)array[head];
    }

    private boolean isEmpty() {
       return tail == head;
    }

    @Override
    public String toString() {
        return Arrays.toString(printQueue());
    }

    private Object[] printQueue() {
        Object[]priorityQueue = new Object[tail];
        int i = 0;
        while(peek() != null) {
            priorityQueue[i] = peek();
            i++;
            pull();
        }
        return priorityQueue;
    }
}
