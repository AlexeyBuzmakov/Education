package collections.tree.t5;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        while(treeSet.size() < 10) {
           treeSet.add(random.nextInt(100));
        }
        System.out.println(treeSet.lower(50));
        System.out.println(treeSet.higher(50));
    }
}
