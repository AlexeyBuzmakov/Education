package multithreading.part1.task2;

public class Utils {

    public static void getSumUseOneThread(int[]arr) throws InterruptedException {
        final long[] sum = {0};
        Thread thread = new Thread(() -> {
            for(int num : arr) {
               sum[0] += num;
            }
        });
        long start = System.nanoTime();
        thread.start();
        thread.join();
        System.out.println("1 поток - Сумма: " + sum[0] + " Время выполнения: " + (System.nanoTime() - start) / 1_000_000 + " мс");
    }

    public static void getSumUseSeveralThreads(int[]arr) throws InterruptedException {
        final long[] sum = {0};
        int index = arr.length/3;
        Thread thread1 = new Thread(() ->{
            for(int i = 0; i < index; i++) {
                sum[0] += arr[i];
            }
        });
        Thread thread2 = new Thread(() ->{
            for(int i = index; i < index * 2; i++) {
                sum[0] += arr[i];
            }
        });
        Thread thread3 = new Thread(() ->{
            for(int i = index * 2; i < arr.length; i++) {
                sum[0] += arr[i];
            }
        });
        long start = System.nanoTime();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println("3 потока - Сумма: " + sum[0] + " Время выполнения: " + (System.nanoTime() - start) / 1_000_000 + " мс");
    }
}
