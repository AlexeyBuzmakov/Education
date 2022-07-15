package multithreading.part2.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Writer writer = new Writer();
        Lists list = new Lists();
        String[]strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Integer[]integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Thread>threadList = new ArrayList<>();
        long start;

        for(int i = 0; i < 5; i++) {
            threadList.add(new Thread(() -> writer.synchronizedMethodFillLists(list, strings, integers)));
        }
        start = System.nanoTime();
        threadList.forEach(Thread::start);
        threadList.forEach(x -> {
            try {
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long time1 = (System.nanoTime() - start) / 1_000_000;

        list.getIntegerList().clear();
        list.getStringLists().clear();
        threadList.clear();

        for(int i = 0; i < 5; i++) {
            threadList.add(new Thread(() -> writer.synchronizedMonitorFillLists(list, strings, integers)));
        }
        start = System.nanoTime();
        threadList.forEach(Thread::start);
        threadList.forEach(x -> {
            try {
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long time2 = (System.nanoTime() - start) / 1_000_000;

        System.out.println("Время заполнения списков через синхронизацию по методу: " + time1 + " ms" +
                           "\nВремя заполнения списков через синхронизацию по двум мониторам: " + time2 + " ms");
    }
}
