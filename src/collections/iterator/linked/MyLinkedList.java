package collections.iterator.linked;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private int size;

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
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

        @Override
        public T next() {
            if(cursor >= size) {
                throw new NoSuchElementException();
            }
            lastReturned = cursor++;
            return MyLinkedList.this.get(lastReturned);
        }

        public void remove() {
            if(lastReturned < 0) {
                throw new IllegalStateException();
            }
            MyLinkedList.this.remove(lastReturned);
            cursor = lastReturned;
            lastReturned = -1;
        }
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if(size != 0) {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    public void add(T element, int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            addFirst(element);
            return;
        }
        Node<T> current = first;
        while(index > 0) {
            current = current.next;
            index--;
        }
        Node<T> newNode = new Node<>(element);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void addLast(T element) {
        if(size == 0) {
            addFirst(element);
            return;
        }
        Node<T> current = first;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(element);
        size++;
    }

    public T get(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        Node<T> current = first;
        while(index > 0) {
            current = current.next;
            index--;
        }
        return current.element;
    }

    public void remove(int index) {
        if (size == 0 || index > size) {
            return;
        }
        Node<T> parent = first;
        Node<T> current = first;
        while (index > 0) {
            parent = current;
            current = current.next;
            index--;
        }
        parent.next = current.next;
        size--;
    }
}
