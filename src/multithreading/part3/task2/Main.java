package multithreading.part3.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        ReaderWriter readerWriter = new ReaderWriter();
        String[]strings = {"read", "write"};
        List<Thread> threadList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            threadList.add(new Thread(() -> {
                try {
                    readerWriter.readWrite(strings[new Random().nextInt(2)]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }
        threadList.forEach(Thread::start);
    }
}
