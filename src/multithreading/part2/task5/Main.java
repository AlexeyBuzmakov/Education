package multithreading.part2.task5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadC1 = new Thread(Printer::synchronizedClassPrintSubsequence);
        Thread threadC2 = new Thread(Printer::synchronizedClassPrintSubsequence);
        Thread threadC3 = new Thread(Printer::synchronizedClassPrintSubsequence);
        Thread threadC4 = new Thread(Printer::synchronizedClassPrintSubsequence);
        Thread threadC5 = new Thread(Printer::synchronizedClassPrintSubsequence);
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();

        Thread threadB1 = new Thread(Printer::synchronizedBlockPrintSubsequence);
        Thread threadB2 = new Thread(Printer::synchronizedBlockPrintSubsequence);
        Thread threadB3 = new Thread(Printer::synchronizedBlockPrintSubsequence);
        Thread threadB4 = new Thread(Printer::synchronizedBlockPrintSubsequence);
        Thread threadB5 = new Thread(Printer::synchronizedBlockPrintSubsequence);
        threadB1.start();
        threadB2.start();
        threadB3.start();
        threadB4.start();
        threadB5.start();

        Thread threadM1 = new Thread(Printer::synchronizedMonitorPrintSubsequence);
        Thread threadM2 = new Thread(Printer::synchronizedMonitorPrintSubsequence);
        Thread threadM3 = new Thread(Printer::synchronizedMonitorPrintSubsequence);
        Thread threadM4 = new Thread(Printer::synchronizedMonitorPrintSubsequence);
        Thread threadM5 = new Thread(Printer::synchronizedMonitorPrintSubsequence);
        threadM1.start();
        threadM2.start();
        threadM3.start();
        threadM4.start();
        threadM5.start();


    }
}
