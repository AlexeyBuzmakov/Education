package multithreading.part3.task6;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class UtilQueue {
    private int countAdd;
    private int countRemove;

    public int getCountAdd() {
        return countAdd;
    }

    public int getCountRemove() {
        return countRemove;
    }

    public synchronized void correctionQueue(BlockingQueue<Integer>queue) throws InterruptedException {
        Random random = new Random();
        int numberCycle = 500;
        while(numberCycle >= 0) {
            switch (random.nextInt(2)) {
                case 0 -> {
                    queue.put(new Random().nextInt(100));
                    countAdd++;
                }
                case 1 -> {
                    if(queue.size() != 0) {
                        queue.take();
                        countRemove++;
                    }
                }
            }
            numberCycle--;
        }
    }
}
