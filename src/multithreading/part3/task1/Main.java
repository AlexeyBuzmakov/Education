package multithreading.part3.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger integer = new AtomicInteger(0);
        Number number = new Number();

        Thread thread1 = new Thread(() -> number.increment(integer));
        Thread thread2 = new Thread(() -> number.increment(integer));
        Thread thread3 = new Thread(() -> number.decrement(integer));
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(integer);
    }
}
