package collections.set.t2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = List.of(15, 222, 15, 45, 76, 15, 400, 45, 111, 45, 92, 76);
        List<Integer>newList = new LinkedList<>(list);

        Collections.sort(newList);
        Set<Integer>set = new LinkedHashSet<>(newList);
        list = new LinkedList<>(set);
        System.out.println(list);
    }
}
