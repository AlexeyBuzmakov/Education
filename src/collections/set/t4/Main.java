package collections.set.t4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str2 = "London is the capital of great Britan";
        String[] chars2 = str2.split("");

        Map<String, Integer>map = new HashMap<>();
        for(String ch : chars2) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }
        System.out.println(map);
    }
}
