package collections.queue;

public interface Queue<T> {

    void offer(T element);

    T poll();

    T remove();

    T element();

    T peek();
}
