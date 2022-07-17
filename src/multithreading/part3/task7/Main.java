package multithreading.part3.task7;

public class Main {
    public static void main(String[] args) {
        String str = "This field is trusted by the VM, and is a subject to constant folding if String instance is constant";

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread thread1 = new Thread(() -> {
            try {
                producerConsumer.produce(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
    }
}
