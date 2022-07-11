package multithreading.part1.task4;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println();
            for(int i = 0; i <= 100; i++) {
                System.out.print(i + " ");
            }
        });
        thread1.setDaemon(true);

        Thread thread2 = new Thread(() -> {
            System.out.println();
            for(int i = 0; i <= 100; i++) {
                System.out.print(i + " ");
            }
        });
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
