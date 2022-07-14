package multithreading.part2.task4;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();
        Printer printer4 = new Printer();
        Printer printer5 = new Printer();

        Thread thread1 = new Thread(printer1::synchronizedClassPrintSubsequence);
        Thread thread2 = new Thread(printer2::synchronizedClassPrintSubsequence);
        Thread thread3 = new Thread(printer3::synchronizedClassPrintSubsequence);
        Thread thread4 = new Thread(printer4::synchronizedClassPrintSubsequence);
        Thread thread5 = new Thread(printer5::synchronizedClassPrintSubsequence);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
