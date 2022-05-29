package collections.iterator.t2;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String>map = Map.of(5,"Bob", 10, "Alex", 22, "John", 37, "Jack");
        Iterator<Integer>iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element + " " + map.get(element));
        }
    }
}
