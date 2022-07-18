package multithreading.part3.task9;

import java.util.ArrayDeque;
import java.util.Queue;

public class Writer {
    private final Queue<String>queue = new ArrayDeque<>();
    private volatile boolean checkEnd = false;

    public synchronized void produceLetter(String letters) throws InterruptedException {
        for(String letter : letters.split("")) {
            if(queue.size() == 1) {
                wait();
            }
            Thread.sleep(400);
            if(letter.equals("_")) {
                System.out.print(letter);
                continue;
            }
            queue.add(letter);
            notifyAll();
        }
        checkEnd = true;
    }

    public synchronized void consumeLetterA() throws InterruptedException {
        while(!checkEnd) {
            if (!queue.contains("A")) {
                wait();
            }
            if(checkEnd) {
                continue;
            }
            System.out.print(queue.poll());
            notify();
        }
    }

    public synchronized void consumeLetterB() throws InterruptedException {
        while(!checkEnd) {
            if (!queue.contains("B")) {
                wait();
            }
            if(checkEnd) {
                continue;
            }
            System.out.print(queue.poll());
            notify();
        }
    }

    public synchronized void consumeLetterC() throws InterruptedException {
        while(!checkEnd) {
            if (!queue.contains("C")) {
                wait();
            }
            System.out.print(queue.poll());
            notify();
        }
    }
}


