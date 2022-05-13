package collections.map.task.t1_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(37, "Pushkin");
        map.put(16, "Tytchev");
        map.put(22, "Dostoevskiy");
        map.put(8, "Tolstoy");
        map.put(81, "Lermontov");
        map.put(9, "Gorkiy");
        map.put(33, "Nekrasov");
        map.put(4, "Gogol");
        map.put(64, "Kuprin");

        List<Integer> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list);
        for(Integer lists : list) {
            System.out.println(lists + "-" + map.put(lists, map.get(lists)));
        }
    }
}
