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
        Node<T> cursor = first;
        Node<T> lastReturned;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            if(cursor == null) {
                throw new NoSuchElementException();
            }
            lastReturned = cursor;
            cursor = cursor.next;
            return lastReturned.element;
       }

        public void remove() {
            if(lastReturned == null) {
                throw new IllegalStateException();
            }
            cursor = lastReturned;
            lastReturned = null;
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
}
