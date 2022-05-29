package collections.additionally.t1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1 = new LinkedHashSet<>();
        set1.add(5);
        set1.add(13);
        set1.add(8);
        set1.add(11);
        set1.add(27);

        Set<Integer>set2 = new LinkedHashSet<>();
        set2.add(13);
        set2.add(97);
        set2.add(22);
        set2.add(15);
        set2.add(4);
        set2.add(27);

        Set<Integer> set3 = new LinkedHashSet<>(set1);

        set3.removeAll(set2);
        set2.removeAll(set1);
        set3.addAll(set2);

        System.out.println(set3);
    }
}
