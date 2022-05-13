package collections.map.task.t2_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String>person = new HashMap<>();
        person.put(1001, "Alexey");
        person.put(1002, "Sergey");
        person.put(1003, "Vladimir");
        person.put(1004, "Irina");
        person.put(1005, "Lubov");

        Set<Integer>keys = person.keySet();
        for(Integer key : keys) {
            System.out.print(key + " | ");
        }

        System.out.println();

        Collection<String> values = person.values();
        for(String value : values) {
            System.out.print(value + " | ");
        }

        System.out.println();

        Set<Map.Entry<Integer, String>>entries = person.entrySet();
        for(Map.Entry<Integer, String>entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
