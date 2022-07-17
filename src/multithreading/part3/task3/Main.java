package multithreading.part3.task3;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        Thread thread1 = new Thread(()-> {
            while(atomicInteger.get() < 1000) {
                Thread.onSpinWait();
            }
        });
        Thread thread2 = new Thread(() -> {
            while(atomicInteger.incrementAndGet() < 1000);
        });
        thread1.start();
        thread2.start();
    }
}
