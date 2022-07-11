package multithreading.part1.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[]arr = new int[10_000_000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Utils.getSumUseOneThread(arr);
        Utils.getSumUseSeveralThreads(arr);
    }
}
