package collections.tree;

public class TreeSet<T extends Comparable<T>>  {
    private Node<T> root;
    private int size;

    public Node<T> getRoot() {
        return root;
    }

    public static class Node<T> {
        public T element;
        public Node<T> left;
        public Node<T> right;

        public Node(T element) {
            this.element = element;
        }
    }


    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            root = newNode;
            size++;
        }
        Node<T> current = root;
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
            if(parrent.left == current) {
                if (current.right != null) {
                    parrent.left = current.right;
                } else {
                    parrent.left = current.left;
                }
            }
            else {
                if (current.right != null) {
                    parrent.right = current.right;
                } else {
                    parrent.right = current.left;
                }
            }
            size--;
            return true;
        }

        Node<T> buf = current.right;                                             //2 потомка
        if (parrent.right == current) {
            if (current.right.left == null) {
                parrent.right = current.right;
                parrent.right.left = current.left;
            } else {
                while (buf.left.left != null) {
                    buf = buf.left;
                }
                current.element = buf.left.element;
                buf.left = null;
            }
        } else {
            if (current.right.left == null) {
                parrent.left = current.right;
                parrent.left.left = current.left;
            } else {
                while (buf.left.left != null) {
                    buf = buf.left;
                }
                current.element = buf.left.element;
                buf.left = null;
            }
        }
        size--;
        return true;
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

