package collections.linkedlist;

public class LinkedList<T> {
    private Node<T> first;
    private int size;

    private static class Node<T> {
        T element;
        Node<T>next;

        public Node(T element) {
            this.element = element;
        }
    }

    public void addFirst(T element) {
        Node<T>newNode = new Node<>(element);
        if(size != 0) {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    public void add(T element, int index) {
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addFirst(element);
            return;
        }
        Node<T> current = first;
        while(index - 1 > 0) {
           current = current.next;
           index--;
        }
        Node<T>newNode = new Node<>(element);
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

    public void removeFirst() {
        if(size == 0) {
            return;
        }
        first = first.next;
        size--;
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
        while(current.next != null) {
            if(current.element == element) {
               current = current.next;
               parent.next = current.next;
               size--;
               continue;
            }
            parent = current;
            current = current.next;
        }
    }

    public void printArray() {
        Node<T> current = first;
        while(current != null) {
            System.out.print(current.element + "  ");
            current = current.next;
        }
    }
}

