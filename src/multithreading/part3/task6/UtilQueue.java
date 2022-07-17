package multithreading.part3.task6;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class UtilQueue {
    private int countAdd;
    private int countRemove;
    private int numberCycle = 500;

    public int getCountAdd() {
        return countAdd;
    }

    public int getCountRemove() {
        return countRemove;
    }

    public synchronized void correctionQueue(BlockingQueue<Integer>queue) throws InterruptedException {
        Random random = new Random();
        while(numberCycle >= 0) {
            switch (random.nextInt(2)) {
                case 0 -> {
                    int num = new Random().nextInt(100);
                    System.out.println("Add: " + num);
                    queue.put(new Random().nextInt(100));
                    countAdd++;
                }
                case 1 -> {
                    System.out.println("Remove: " + queue.take());
                    countRemove++;
                }
            }
            numberCycle--;
        }
    }
}
