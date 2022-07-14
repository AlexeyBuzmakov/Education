package multithreading.part2.task7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Writer writer = new Writer();
        Lists lists = new Lists();

        String[]strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Integer[]integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Thread thread1 = new Thread(() -> {
            writer.fillLists(lists, strings, integers);
        });
        Thread thread2 = new Thread(() -> {
            writer.fillLists(lists, strings, integers);
        });
        Thread thread3 = new Thread(() -> {
            writer.fillLists(lists, strings, integers);
        });
        Thread thread4 = new Thread(() -> {
            writer.fillLists(lists, strings, integers);
        });
        Thread thread5 = new Thread(() -> {
            writer.fillLists(lists, strings, integers);
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
