package collections.tree.t1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[]arr = {5, 16, 98, 44, 25, 13, 101, 32};
        Set<Integer>set = new TreeSet<>();

        for(int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
