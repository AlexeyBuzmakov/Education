package multithreading.part2.task6;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String>list1 = List.of("1", "2", "3", "4", "5");
        List<String>list2 = List.of("6", "7", "8", "9", "10");
        List<String>list3 = List.of("11", "12", "13", "14", "15");
        List<String>list4 = List.of("16", "17", "18", "19", "20");
        List<String>list5 = List.of("21", "22", "23", "24", "25");
        List<List<String>>lists = List.of(list1, list2, list3, list4, list5);
        Writer writer = new Writer();
        Thread thread1 = new Thread(() -> {
            try {
                writer.write(lists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                writer.write(lists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                writer.write(lists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread thread4 = new Thread(() -> {
            try {
                writer.write(lists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread thread5 = new Thread(() -> {
            try {
                writer.write(lists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
