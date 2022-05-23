package collections.tree;

import java.util.Comparator;
import java.util.Objects;

public class TreeSet<T>{
    private Node<T> root;
    private int size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeSet<?> treeSet = (TreeSet<?>) o;
        return Objects.equals(root, treeSet.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    private static class Node<T> implements Comparator<Node<T>> {
        T element;
        Node<T>left;
        Node<T>right;

        public Node(T element) {
            this.element = element;
        }

        public Node<T> getLeft() {
            return left;
        }

        public Node<T> getRight() {
            return right;
        }


        @Override
        public int compare(Node<T> o1, Node<T> o2) {
            return Integer.compare(o1.element, o2.getLeft());
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(size == 0) {
           root = newNode;
        }
        else{
            while(true) {
                if() {

                }
            }
        }

    }
}
