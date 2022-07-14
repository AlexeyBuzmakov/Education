package multithreading.part2.task3;

public class Printer {
    private final Object monitor = new Object();

    public synchronized void synchronizedObjectPrintSubsequence() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void synchronizedBlockPrintSubsequence() {
        synchronized (this) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void synchronizedMonitorPrintSubsequence() {
        synchronized (monitor) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
