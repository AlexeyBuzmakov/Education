package multithreading.part3.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReaderWriter {

    public synchronized void readWrite(String str) throws IOException {
        switch(str) {
            case "write" -> {
                for(int i = 0; i < 5; i++) {
                    Files.writeString(Paths.get("Test.txt"), "London, Great Britain", StandardOpenOption.APPEND);
                }
            }
            case "read" -> System.out.println(Files.readAllLines(Paths.get("Test.txt")));
        }
    }
}
