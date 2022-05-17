package collections.set.t5;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = List.of(4, 4, 4, 21, 38, 38, 56, 75, 75, 93, 93, 93, 112);
        Set<Integer>set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
