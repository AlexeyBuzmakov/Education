package multithreading.part1.task5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i <= 100; i++) {
                System.out.print(i + " ");
            }
        });

        Thread thread2 = new Thread(() -> {
            if(!thread1.isAlive()) {
                for (int i = 0; i <= 100; i++) {
                    System.out.print(i + " ");
                }
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}
