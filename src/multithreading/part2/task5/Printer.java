package multithreading.part2.task5;

public class Printer {
    private static final Object MONITOR = new Object();
    public static synchronized void synchronizedClassPrintSubsequence() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void synchronizedBlockPrintSubsequence() {
        synchronized (Printer.class) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void synchronizedMonitorPrintSubsequence() {
        synchronized (MONITOR) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
