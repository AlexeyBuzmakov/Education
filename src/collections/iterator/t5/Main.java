package collections.iterator.t5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer>set = new TreeSet<>();
        set.add(22);
        set.add(45);
        set.add(93);
        set.add(15);
        set.add(66);
        set.add(37);
        set.add(84);

        set = set.headSet(30);
        System.out.println(set);
    }
}
