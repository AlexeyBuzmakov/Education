package collections.list;

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
    public void addFirst(T element) {                                          //2.1   O(1)
        Node<T>newNode = new Node<>(element);
        if(size != 0) {
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    public void add(T element, int index) {                                    //2.2    O(n)
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

    public void addLast(T element) {                                           //2.3    O(n) в данном случае
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

    public void removeFirst() {                                                //3.1     O(1)
        if(size == 0) {
            return;
        }
        first = first.next;
        size--;
    }

    public void remove(int index) {                                            //3.2    O(n)
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

    public void removeLast() {                                                 //3.3   O(n) в данном случае
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

    public void removeElement(T element) {            //4   O(n)    с этим надо разобраться
        if (size == 0) {
            return;
        }
        Node<T> parent = first;
        Node<T> current = first;
        while(current.next != null) {
            parent = current;
            current = current.next;
            if(current.element == element) {
               current.element = parent.element;
               size--;

            }
            System.out.print(current.element + " ");
        }
    }

    public boolean find(T element) {                                            //5   O(n)
        if (size == 0) {
            return false;
        }
        Node<T>current = first;
        while(current.next != null) {
            if(current.element == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @SuppressWarnings("unchecked")                                              //6
    public T[] toArray() {
        Object[]arr = new Object[size];
        Node<T> current = first;
        int i = 0;
        while(current != null) {
            arr[i] = current.element;
            current = current.next;
            i++;
        }
        return (T[]) arr;
    }

    //7 у LinkedList нет Capacity, смысла в методе trimToSize нет.

    public T sum () {                                                    //8
        Node<T>current = first;
        Double sum = (double) 0;
        if(current.element instanceof Number) {
            while (current != null) {
                sum += (Double) current.element;
                current = current.next;
            }
            return (T)sum;
        }
        return null;
    }


    public void push(T element) {                                               //9.1
       addLast(element);
    }

    public T pop() {                                                            //9.2
        if (size == 0) {
            return null;
        }
        Node<T> parent = first;
        Node<T> current = first;
        while (current.next != null) {
            parent = current;
            current = current.next;
        }
        parent.next = null;
        size--;
        return current.element;
    }

    public T peek() {                                                           //9.3
        if (size == 0) {
            return null;
        }
        Node<T> current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current.element;
    }
}

