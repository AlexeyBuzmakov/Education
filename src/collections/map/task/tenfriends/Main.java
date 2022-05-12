package collections.map.task.tenfriends;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[]arr = {4, 9, 1, 7, 4, 8, 4, 5, 2, 4};
        Map<Integer, Integer>map = new HashMap<>();

        for(Integer numb : arr) {
            if(map.containsKey(numb)) {
                map.put(numb, map.get(numb) + 1);
                continue;
            }
            map.put(numb, 0);
        }


        int maxRepet = Integer.MIN_VALUE;
        int numb = 0;
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            if(map.get(key) > maxRepet) {
                maxRepet = map.get(key);
                numb = key;
            }
        }
        System.out.println(numb);
    }
}
