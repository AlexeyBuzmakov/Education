package multithreading.part2.task4;

public class Printer {

    public void synchronizedClassPrintSubsequence() {
        synchronized (Printer.class) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
