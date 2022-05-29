package collections.iterator.t1;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = List.of(13, 22, 97, 103, 15, 48, 37);
        Iterator<Integer>iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
