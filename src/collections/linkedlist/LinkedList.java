package collections.linkedlist;

public class LinkedList<T> {
    private Node<T> first;
    private int size;

    public void addFirst() {

    }



    private static class Node<T> {
        T element;
        Node<T>next;

        public Node(T item, Node<T> next) {
            this.element = item;
            this.next = next;
        }
    }
}

