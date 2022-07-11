package multithreading.part1.task1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();

        Thread thread1 = new Thread(() -> {});
        thread1.start();
    }
}
