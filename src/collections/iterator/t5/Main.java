package collections.iterator.t5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set = new LinkedHashSet<>();
        set.add(22);
        set.add(45);
        set.add(93);
        set.add(15);
        set.add(66);
        set.add(37);
        set.add(84);
        Set<Integer>set2 = new LinkedHashSet<>();
        Iterator<Integer>iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            if(element > 30) {
              set2.add(element);
            }
        }
        set.removeAll(set2);
        System.out.println(set);
    }
}
