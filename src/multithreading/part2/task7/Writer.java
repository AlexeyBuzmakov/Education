package multithreading.part2.task7;

import java.util.Arrays;

public class Writer {

    public synchronized void fillLists(Lists lists, String[]strings, Integer[]integers) {
        Arrays.stream(strings)
                .forEach(x -> lists.getStringLists().add(x));
        Arrays.stream(integers)
                .forEach(x -> lists.getIntegerList().add(x));

    }
}
