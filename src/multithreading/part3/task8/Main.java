package multithreading.part3.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        Thread thread1 = new Thread(() -> {
            try {
                utils.print("A");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                utils.print("B");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                utils.print("C");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
