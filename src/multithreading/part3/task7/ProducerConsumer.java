package multithreading.part3.task7;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumer {
    private Queue<String>queue = new ArrayDeque<>();
    private volatile boolean checkEnd = false;

    public synchronized void produce(String str) throws InterruptedException {
        String[]strings = str.split(" ");
        for(String string : strings) {
            if(queue.size() == 1) {
                wait();
            }
            Thread.sleep(400);
            System.out.println("Produce: " + string);
            queue.add(string);
            notify();
        }
        checkEnd = true;
    }

    public synchronized void consume() throws InterruptedException {
        while(!checkEnd) {
            if(queue.size() == 0) {
                wait();
            }
            Thread.sleep(400);
            System.out.println("Consume: " + queue.poll());
            notify();
        }
    }
}
