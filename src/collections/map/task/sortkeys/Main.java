package collections.map.task.sortkeys;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Pushkin");
        map.put(7, "Tytchev");
        map.put(3, "Dostoevskiy");
        map.put(8, "Tolstoy");
        map.put(1, "Lermontov");
        map.put(9, "Gorkiy");
        map.put(2, "Nekrasov");
        map.put(4, "Gogol");
        map.put(6, "Kuprin");

        Map<Integer, String> sortedMap = new TreeMap<>(map);
        map.putAll(sortedMap);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
