package multithreading.part2.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread threadO1 = new Thread(printer::synchronizedObjectPrintSubsequence);
        Thread threadO2 = new Thread(printer::synchronizedObjectPrintSubsequence);
        Thread threadO3 = new Thread(printer::synchronizedObjectPrintSubsequence);
        Thread threadO4 = new Thread(printer::synchronizedObjectPrintSubsequence);
        Thread threadO5 = new Thread(printer::synchronizedObjectPrintSubsequence);
        threadO1.start();
        threadO2.start();
        threadO3.start();
        threadO4.start();
        threadO5.start();

        Thread threadB1 = new Thread(printer::synchronizedBlockPrintSubsequence);
        Thread threadB2 = new Thread(printer::synchronizedBlockPrintSubsequence);
        Thread threadB3 = new Thread(printer::synchronizedBlockPrintSubsequence);
        Thread threadB4 = new Thread(printer::synchronizedBlockPrintSubsequence);
        Thread threadB5 = new Thread(printer::synchronizedBlockPrintSubsequence);
        threadB1.start();
        threadB2.start();
        threadB3.start();
        threadB4.start();
        threadB5.start();

        Thread threadM1 = new Thread(printer::synchronizedMonitorPrintSubsequence);
        Thread threadM2 = new Thread(printer::synchronizedMonitorPrintSubsequence);
        Thread threadM3 = new Thread(printer::synchronizedMonitorPrintSubsequence);
        Thread threadM4 = new Thread(printer::synchronizedMonitorPrintSubsequence);
        Thread threadM5 = new Thread(printer::synchronizedMonitorPrintSubsequence);
        threadM1.start();
        threadM2.start();
        threadM3.start();
        threadM4.start();
        threadM5.start();
    }
}
