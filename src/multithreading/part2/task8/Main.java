package multithreading.part2.task8;

public class Main {
    public static void main(String[] args) {
        char[]alphabet = new char[26];
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (i + 65);
        }

        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> {
            int i = 0;
            while(i < alphabet.length) {
                if(!printer.isCheckTurn()) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    printer.printAlphabet(alphabet, i);
                    i += 2;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int i = 1;
            while(i < alphabet.length) {
               if(printer.isCheckTurn()) {
                   try {
                       Thread.sleep(300);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   printer.printAlphabet(alphabet, i);
                   i += 2;
               }
           }
        });
        thread1.start();
        thread2.start();
    }
}
