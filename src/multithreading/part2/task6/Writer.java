package multithreading.part2.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Writer {

    public synchronized void write(List<String> list) throws IOException {
        Files.writeString(Paths.get("Test.txt"), list.toString(), StandardOpenOption.APPEND);
    }
}
