package generics.generics3.task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Utils <T>{

    public void sort(ArrayList<T> list, Comparator<T> comparator) {
        T buf = null;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(comparator.compare(list.get(i), list.get(j)) < 0) {
                    buf = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buf);
                }
            }
        }
        System.out.println(list);
    }
}
