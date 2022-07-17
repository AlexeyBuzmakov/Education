package multithreading.part3.task8;

import java.util.concurrent.atomic.AtomicInteger;

public class Utils {
    private AtomicInteger countCycle = new AtomicInteger(0);
    private AtomicInteger integer = new AtomicInteger(0);
    String[]str = {"A", "B", "C"};

    public synchronized void print(String letter) throws InterruptedException {
        while(true) {
            if (!str[integer.get()].equals(letter)) {
                wait();
            }
            notify();
            if(countCycle.get() == 3) {
                break;
            }
            System.out.print(str[integer.getAndIncrement()]);
            if(countCycle.get() < 2 && integer.get() == 3) {
                System.out.print("_");
            }
            if(integer.get() == 3) {
                integer.set(0);
                countCycle.getAndIncrement();
            }
        }
    }
}


