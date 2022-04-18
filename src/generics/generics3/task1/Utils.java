package generics.generics3.task1;

import java.util.ArrayList;

public class Utils <T extends Comparable <T>>{

    public void compare(T ob1, T ob2) {
        if(ob1.compareTo(ob2) >= 0)  {
            System.out.println(ob2 + " " + ob1);
        }
        else {
            System.out.println(ob1 + " " + ob2);
        }
    }

    public void sort(ArrayList<T> list) {
        T buf = null;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) < 0) {
                    buf = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buf);
                }
            }
        }
        System.out.println(list);
    }
}
