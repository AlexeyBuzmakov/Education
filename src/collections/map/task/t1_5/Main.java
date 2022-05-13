package collections.map.task.t1_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "Mersedes");
        map.put(2, "BMW");
        map.put(3, "Toyota");
        map.put(4, "Honda");
        map.put(5, "Chevrolet");

        Set<Integer>keys = map.keySet();
        for(Integer key : keys) {
            System.out.println("Ключ: " +  key + " Значение: " + map.get(key));
        }
    }
}
