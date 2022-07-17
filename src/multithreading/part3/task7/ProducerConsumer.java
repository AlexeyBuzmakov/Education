package multithreading.part3.task7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumer {
    private final BlockingQueue<String>queue = new ArrayBlockingQueue<>(1);

    public void produce(String str) throws InterruptedException {
        String[]strings = str.split(" ");
        for(String string : strings) {
            System.out.println("Produce: " + string);
            Thread.sleep(400);
            queue.put(string);
            Thread.sleep(400);
        }
    }

    public void consume() throws InterruptedException {
        while(true) {
            System.out.println("Consume: " + queue.take());
        }
    }
}
