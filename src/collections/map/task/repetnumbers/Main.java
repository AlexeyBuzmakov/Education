package collections.map.task.repetnumbers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[]arr = {5, 16, 5, 97, 3, 5, 97, 11, 88, 5, 3};
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer numb : arr) {
            if(map.containsKey(numb)) {
                map.put(numb, map.get(numb) + 1);
                continue;
            }
            map.put(numb, 0);
        }
        System.out.println(map);
    }
}
