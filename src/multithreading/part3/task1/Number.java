package multithreading.part3.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Number {

    public void increment(AtomicInteger integer) {
        int i = 100;
        while(i >= 0) {
            integer.getAndIncrement();
            i--;
        }
    }

    public void decrement(AtomicInteger integer) {
        int i = 100;
        while(i >= 0) {
            integer.getAndDecrement();
            i--;
        }
    }
}
