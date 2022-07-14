package multithreading.part2.task7;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private final List<String>stringLists = new ArrayList<>();
    private final List<Integer>integerList = new ArrayList<>();

    public List<String> getStringLists() {
        return stringLists;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    @Override
    public String toString() {
        return stringLists + "\n" + integerList;
    }
}
