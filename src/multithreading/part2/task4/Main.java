package multithreading.part2.task4;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();
        Printer printer4 = new Printer();
        Printer printer5 = new Printer();

        Thread threadC1 = new Thread(printer1::synchronizedClassPrintSubsequence);
        Thread threadC2 = new Thread(printer2::synchronizedClassPrintSubsequence);
        Thread threadC3 = new Thread(printer3::synchronizedClassPrintSubsequence);
        Thread threadC4 = new Thread(printer4::synchronizedClassPrintSubsequence);
        Thread threadC5 = new Thread(printer5::synchronizedClassPrintSubsequence);
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();

        Thread threadM1 = new Thread(printer1::synchronizedMethodPrintSubsequence);
        Thread threadM2 = new Thread(printer1::synchronizedMethodPrintSubsequence);
        Thread threadM3 = new Thread(printer1::synchronizedMethodPrintSubsequence);
        Thread threadM4 = new Thread(printer1::synchronizedMethodPrintSubsequence);
        Thread threadM5 = new Thread(printer1::synchronizedMethodPrintSubsequence);
        threadM1.start();
        threadM2.start();
        threadM3.start();
        threadM4.start();
        threadM5.start();
    }
}
