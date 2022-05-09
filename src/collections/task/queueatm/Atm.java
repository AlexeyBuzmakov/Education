package collections.task.queueatm;

import java.util.ArrayDeque;
import java.util.Random;

public class Atm {
    private static int Count;
    ArrayDeque<Person>atmFirst = new ArrayDeque<>();
    ArrayDeque<Person>atmSecond = new ArrayDeque<>();

    public void start() {
        fillQueue();
        Count = atmFirst.size() + atmSecond.size();
        while (atmServiceOver()) {
            moveQueue();
            printQueue();
        }
    }

    private void fillQueue() {
        fillQueueAtm(atmFirst);
        fillQueueAtm(atmSecond);
    }

    private void fillQueueAtm(ArrayDeque<Person>arrayDeque) {
        Random random = new Random();
        int startSize = random.nextInt(10);
        while (startSize > 0) {
            arrayDeque.offer(new Person());
            startSize--;
        }
    }

    private void moveQueue() {
        increaseQueue();
        reductionQueue();
    }

    private void increaseQueue() {
        if (checkFillQueue()) {
            atmSecond.offer(new Person());
            return;
        }
        atmFirst.offer(new Person());
    }

    private boolean checkFillQueue() {
        return atmFirst.size() > atmSecond.size();
    }

    private void reductionQueue() {
        reductionQueueAtm(atmFirst);
        reductionQueueAtm(atmSecond);
    }

    private void reductionQueueAtm(ArrayDeque<Person>arrayDeque) {
        Random random = new Random();
        boolean a = random.nextBoolean();
        if (a) {
            arrayDeque.poll();
            Count++;
        }
    }

    private boolean atmServiceOver() {
        return Count <= 100;
    }

    private void printQueue() {
        System.out.print(atmFirst);
        System.out.println();
        System.out.print(atmSecond);
        System.out.println();
        System.out.println(Count);
    }
}

