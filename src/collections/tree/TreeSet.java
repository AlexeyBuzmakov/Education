package collections.tree;

public class TreeSet<T extends Comparable<T>>  {
    private Node<T> root;
    private int size;

    private static class Node<T> {
        T element;
        Node<T>left;
        Node<T>right;

        public Node(T element) {
            this.element = element;
        }
    }

    public void add(T element) {
        Node<T>newNode = new Node<>(element);
        if(size == 0) {
            root = newNode;
            size++;
        }
        Node<T>current = root;
        while (current.element != element) {
            if (element.compareTo(current.element) < 0) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = newNode;
                    size++;
                    break;
                }
            } else if (element.compareTo(current.element) > 0) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = newNode;
                    size++;
                    break;
                }
            }
        }
    }

    public boolean remove(T element) {
        if (size == 0) {
            return false;
        }
        Node<T> parrent = root;
        Node<T> current = root;
        while (current.element != element) {
            if (element.compareTo(current.element) < 0) {
                parrent = current;
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                parrent = current;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        if (current.right == null && current.left == null) {                     //0 потомков
            if (element.compareTo(parrent.element) < 0) {
                parrent.left = null;
            } else {
                parrent.right = null;
            }
            size--;
            return true;
        }

        if (current.right == null || current.left == null) {                     //1 потомок
            if (current.left != null) {
                parrent.left = current.left;
            } else {
                parrent.right = current.right;
            }
            size--;
            return true;
        }

        Node<T>buf = current;                                                   //2 потомка
        buf = buf.right;
        while(buf.left != null) {
            buf = buf.left;
        }
        if (current.element.compareTo(buf.element) > current.element.compareTo(current.right.element)) {
            if(parrent.right.element.compareTo(current.element) == 0) {
                parrent.right = current.right;
            }
            else {
                parrent.left = current.right;
            }
        }
        else {
            current.element = buf.element;
        }
        size--;

        return false;
    }

    public boolean contains(T element) {
        if (size == 0) {
            return false;
        }
        Node<T> current = root;
        while (current.element != element) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        return true;
    }

    public void printTree() {
        inOrder(root);

    }

    private void inOrder(Node<T> current) {
        if (current != null) {
            inOrder(current.left);
            System.out.println(current.element);
            inOrder(current.right);
        }
    }
}

