package multithreading.part2.task6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        List<String> list1 = List.of("1", "2", "3", "4", "5");
        List<String> list2 = List.of("6", "7", "8", "9", "10");
        List<String> list3 = List.of("11", "12", "13", "14", "15");
        List<String> list4 = List.of("16", "17", "18", "19", "20");
        List<String> list5 = List.of("21", "22", "23", "24", "25");
        List<List<String>> lists = List.of(list1, list2, list3, list4, list5);
        Writer writer = new Writer();
        List<Thread> threadList = new ArrayList<>();
        lists.forEach(x -> threadList.add(new Thread(() -> {
                    try {
                        writer.write(x);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })));
        threadList.forEach(Thread::start);
    }
}
