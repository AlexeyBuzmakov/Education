package multithreading.part3.task10;

import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Writer {
    private final Set<String>set = Set.of("A", "B", "C");
    private BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
    private volatile boolean checkEnd = false;

    public void produceLetter(String letters) throws InterruptedException {
        for(String letter : letters.split("")) {
            if(set.contains(letter)) {
                queue.put(letter);
                Thread.sleep(400);
            }
        }
        checkEnd = true;
    }

    public void consumeLetterA() throws InterruptedException {
        while(!checkEnd) {
            if (queue.contains("A")) {
                System.out.print(queue.take());
            }
        }
    }

    public void consumeLetterB() throws InterruptedException {
        while(!checkEnd) {
            if (queue.contains("B")) {
                System.out.print(queue.take());
            }
        }
    }

    public void consumeLetterC() throws InterruptedException {
        while(!checkEnd) {
            if (queue.contains("C")) {
                System.out.print(queue.take());
            }
        }
    }
}
