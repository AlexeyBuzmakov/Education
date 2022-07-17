package multithreading.part3.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        UtilList utilList = new UtilList();

        Thread thread1 = new Thread(() -> utilList.correctionList(list));
        Thread thread2 = new Thread(() -> utilList.correctionList(list));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        boolean checkListSize = list.size() == (utilList.getCountAdd() - utilList.getCountRemove());
        System.out.println("Count add: " + utilList.getCountAdd() + "\nCount remove: " + utilList.getCountRemove() +
                "\nTotal list size: " + list.size() + "\nCheck correctness calculations : " + checkListSize);
    }
}
