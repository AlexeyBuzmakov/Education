package collections.list;

public interface List<T>{

    void addFirst(T element);

    void add(T element, int index);

    void addLast(T element);

    void removeFirst();

    void remove(int index);

    void removeLast();

}
