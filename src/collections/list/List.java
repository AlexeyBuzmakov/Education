package collections.list;

public interface List<T>{

    void addFirst(T element);

    void add(T element, int index);

    void addLast(T element);

    void removeFirst();

    void remove(int index);

    void removeLast();

    void removeElement(T element);

    T[] toArray();

    T get(int index);

    void set(T element, int index);

    boolean find(T element);

//    void addAll(List<T>newList);


}
