package multithreading.part3.task6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UtilQueue utilQueue = new UtilQueue();
        BlockingQueue<Integer>queue = new ArrayBlockingQueue<>(500);

        Thread thread1 = new Thread(() -> {
            try {
                utilQueue.correctionQueue(queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                utilQueue.correctionQueue(queue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Count add: " + utilQueue.getCountAdd() + "\nCount remove: " + utilQueue.getCountRemove() +
                "\nTotal list size: " + queue.size());
    }
}
