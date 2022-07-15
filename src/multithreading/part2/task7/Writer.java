package multithreading.part2.task7;

import java.util.Arrays;

public class Writer {
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public synchronized void synchronizedMethodFillLists(Lists lists, String[]strings, Integer[]integers) {
        Arrays.stream(strings)
                .forEach(x -> lists.getStringLists().add(x));
        Arrays.stream(integers)
                .forEach(x -> lists.getIntegerList().add(x));
    }

    public void synchronizedMonitorFillLists(Lists lists, String[]strings, Integer[]integers) {
        synchronized (monitor1) {
            Arrays.stream(strings)
                    .forEach(x -> lists.getStringLists().add(x));
        }
        synchronized (monitor2)  {
            Arrays.stream(integers)
                    .forEach(x -> lists.getIntegerList().add(x));
        }
    }
}
