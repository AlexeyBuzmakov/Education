package multithreading.part2.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Writer {
    private int index = 0;

    public synchronized void write(List<List<String>> lists) throws IOException {
        Files.writeString(Paths.get("Test.txt"), lists.get(index).toString(), StandardOpenOption.APPEND);
        index++;
    }
}
