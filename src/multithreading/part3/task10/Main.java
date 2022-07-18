package multithreading.part3.task10;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Writer writer = new Writer();
        List<Thread>listThread = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        listThread.add(new Thread(() -> {
            try {
                writer.consumeLetterA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        listThread.add(new Thread(() -> {
            try {
                writer.consumeLetterB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        listThread.add(new Thread(() -> {
            try {
                writer.consumeLetterC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        listThread.add(new Thread(() -> {
            try {
                writer.produceLetter(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        listThread.forEach(Thread::start);
    }
}
