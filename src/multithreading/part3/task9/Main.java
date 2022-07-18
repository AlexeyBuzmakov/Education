package multithreading.part3.task9;

public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer();
        String str = "ABC_ABC_ABC";
        Thread thread1 = new Thread(() -> {
            try {
                writer.consumeLetterA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                writer.consumeLetterB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                writer.consumeLetterC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread4 = new Thread(() -> {
            try {
                writer.produceLetter(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
