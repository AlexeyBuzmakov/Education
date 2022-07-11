package multithreading.part1.task6;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[]threads = new Thread[10];
        for(Thread thread : threads) {
            thread = new Thread(() -> {});
            thread.start();
            thread.join();
        }
    }
}
