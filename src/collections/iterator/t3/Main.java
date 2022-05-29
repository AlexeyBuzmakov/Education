package collections.iterator.t3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(55);
        list.add(22);
        list.add(67);
        list.add(13);
        list.add(91);
        list.add(3);
        list.add(102);
        Iterator<Integer>iterator = list.iterator();
        List<Integer>list2 = new LinkedList<>();
        int i = 0;
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            if(i % 2 == 0) {
                list2.add(element);
            }
            i++;
        }
        list.removeAll(list2);
        System.out.println(list);
    }
}
