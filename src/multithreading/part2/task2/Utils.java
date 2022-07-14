package multithreading.part2.task2;

public class Utils {
    private volatile int counter;

    public void stopWhile() {
        Thread thread1 = new Thread(() -> {
            while (checkEndCycle()) {
                Thread.onSpinWait();
            }
            System.out.println("Цикл завершён на числе: " + counter);
        });

        Thread thread2 = new Thread(() -> {
            int num = 0;
            while(checkEndCycle()) {
                num++;
                counter = num;
            }
        });
        thread1.start();
        thread2.start();
    }

    private boolean checkEndCycle() {
        return counter < 1000;
    }
}
