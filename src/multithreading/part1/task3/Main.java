package multithreading.part1.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[]threads = new Thread[5];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println("I am thread"));
            threads[i].start();
            threads[i].join();
        }
        System.out.println("Все потоки отработали");
    }
}
