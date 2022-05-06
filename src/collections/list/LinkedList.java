package collections.list;

import java.util.Arrays;
import java.util.Comparator;

public class LinkedList<T> implements List<T>{
    private Node<T> first;
    private int size;

    private static class Node<T> {
        T element;
        Node<T>next;

        public Node(T element) {
            this.element = element;
        }
    }

    @Override
    public void addFirst(T element) {
        Node<T>newNode = new Node<>(element);
        if(size != 0) {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    @Override
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
        Node<T>newNode = new Node<>(element);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }


    @Override
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
            return;
        }
        first = first.next;
        size--;
    }

    @Override
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

    @Override
    public void removeLast() {
        if (size == 0) {
            return;
        }
        Node<T> parent = first;
        Node<T> current = first;
        while (current.next != null) {
            parent = current;
            current = current.next;
        }
        parent.next = null;
        size--;
    }

    public void removeElement(T element) {
        if (size == 0) {
            return;
        }
        Node<T> parent = first;
        Node<T> current = first;
        if(first.element.equals(element)) {
            removeFirst();
        }
        while(current.next != null) {
            parent = current;
            current = current.next;
            if(current.element.equals(element)) {
               current.next = parent.next;
               size--;
            }
        }
    }

    @Override
    public T get(int index) {
        if(index >= size || index < 0) {
           throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        Node<T>current = first;
        while(index > 0) {
            current = current.next;
            index--;
        }
        return current.element;
    }

    @Override
    public void set(T element, int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Некорректный ввод индекса");
        }
        Node<T>current = first;
        while(index > 0) {
            current = current.next;
            index--;
        }
        current.element = element;
    }

    @Override
    public boolean find(T element) {
        if (size == 0) {
            return false;
        }
        Node<T>current = first;
        while(current.next != null) {
            if(current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        Node<T>buf;
        Node<T>current = first;
        while(current != null) {
            if(comparator.compare(current.element, current.next.element) > 0) {
                buf = current;
                current = current.next;
                current.next = buf;
                continue;
            }
            current = current.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray(T[]arr) {
        if (arr.length < size)
            arr = (T[])java.lang.reflect.Array.newInstance(
                    arr.getClass(), size);
        int i = 0;
        Object[] result = arr;
        for (Node<T> current = first; current != null; current = current.next)
            result[i++] = current.element;

        if (arr.length > size)
            arr[size] = null;

        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(createList());
    }

    private Object[] createList() {
        Object[]array = new Object[size];
        Node<T>current = first;
        int i = 0;
        while(current != null) {
            array[i] = current.element;
            current = current.next;
            i++;
        }
        return array;
    }

    public void push(T element) {
        addLast(element);
    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        T buf = get(size--);
        removeLast();
        return buf;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return get(size--);
    }
}

