package collections.tree;

public class TreeSet<T extends Comparable<T>>  {
    private Node<T> root;
    private int size;

    private static class Node<T> {
        T element;
        Node<T>upper;
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
        while (true) {
            if (element.compareTo(current.element) < 0) {
                if (current.left != null) {
                    current = current.left;
                    continue;
                }
                current.left = newNode;
                size++;
                break;
            }
            if (element.compareTo(current.element) > 0) {
                if (current.right != null) {
                    current = current.right;
                    continue;
                }
                current.right = newNode;
                size++;
                break;
            } else {
                break;
            }
        }
    }

    public boolean contains(T element) {
        if (size != 0) {
            Node<T> current = root;
            while (current.left != null && current.right != null) {
                System.out.println(current.element);
                if (current.element == element) {
                    return true;
                }
                if (element.compareTo(current.element) < 0) {
                    current = current.left;
                    continue;
                }
                if (element.compareTo(current.element) > 0) {
                    current = current.right;
                }
            }
        }
        return false;
    }




    private Node<T> lowerLeftElement() {
        if(size != 0) {
            Node<T>current = root;
           while(current.left != null) {
               current = current.left;
           }
           return current;
        }
        return null;
    }
}

