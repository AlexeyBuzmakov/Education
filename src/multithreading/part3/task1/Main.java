package multithreading.part3.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger integer = new AtomicInteger(0);

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                integer.getAndIncrement();
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                integer.getAndIncrement();
            }
        });
        Thread thread3 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                integer.getAndDecrement();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
