package collections.list;

import java.util.Comparator;

public interface List<T>{

    void addFirst(T element);

    void add(T element, int index);

    void addLast(T element);

    void addAll(List<T>list);

    void removeFirst();

    void remove(int index);

    void removeLast();

    void removeElement(T element);

    T get(int index);

    void set(T element, int index);

    boolean find(T element);

    void sort(Comparator<T> comparator);

    int size();

    T[] toArray(T[]arr);
}
