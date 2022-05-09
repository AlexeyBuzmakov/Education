package collections.queue;

public interface Queue<T> {

    void offer(T element);

    T pull();

    T remove();

    T element();

    T peek();
}
