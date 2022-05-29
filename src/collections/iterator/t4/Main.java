package collections.iterator.t4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set = new LinkedHashSet<>();
        set.add(13);
        set.add(48);
        set.add(56);
        set.add(2);
        set.add(17);
        set.add(73);
        set.add(105);
        Set<Integer>set2 = new LinkedHashSet<>();
        Iterator<Integer>iterator = set.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            if(i % 2 != 0) {
               set2.add(element);
            }
            i++;
        }
        set.removeAll(set2);
        System.out.println(set);
    }
}
