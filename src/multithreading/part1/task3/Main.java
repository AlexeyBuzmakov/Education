package multithreading.part1.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[]threads = new Thread[5];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {});
        }
        threads[0].start();
        threads[1].start();
        threads[2].start();
        threads[3].start();
        threads[4].start();
        threads[0].join();
        threads[1].join();
        threads[2].join();
        threads[3].join();
        threads[4].join();
        System.out.println("Все потоки отработали");
    }
}
