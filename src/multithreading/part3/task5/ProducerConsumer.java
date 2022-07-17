package multithreading.part3.task5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    public static final int MAX_SIZE = 10;
    Queue<Integer>queue = new ArrayDeque<>();


    public synchronized void produce() throws InterruptedException {
        while (true) {
            if (queue.size() == MAX_SIZE) {
                wait();
            }
            notify();
            Thread.sleep(500);
            int num = new Random().nextInt(100);
            System.out.println("Produced: " + num);
            queue.add(num);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            if (queue.size() == 0) {
                wait();
            }
            Thread.sleep(500);
            System.out.println("Consumed: " + queue.poll());
            notify();
        }
    }
}
