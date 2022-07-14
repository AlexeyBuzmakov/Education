package multithreading.part2.task1;

import java.util.Random;

public class Utils {
    private volatile int randomNum;

    public void stopWhile() {
        Thread thread1 = new Thread(() -> {
            while (checkEndCycle()) {
                Thread.onSpinWait();
            }
            System.out.println("Цикл завершён на числе: " + randomNum);
        });

        Thread thread2 = new Thread(() -> {
            while(checkEndCycle()) {
                randomNum = new Random().nextInt(11);
            }
        });
        thread1.start();
        thread2.start();
    }

    private boolean checkEndCycle() {
        return randomNum != 10;
    }
}
