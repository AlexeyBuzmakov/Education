package collections.additionally.t3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(22);
        treeSet.add(48);
        treeSet.add(17);
        treeSet.add(7);
        treeSet.add(92);
        treeSet.add(11);
        List<Integer>set = new LinkedList<>(treeSet);
        Collections.reverse(set);
        System.out.println(set);
    }
}
