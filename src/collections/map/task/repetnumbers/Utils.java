package collections.map.task.repetnumbers;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static void printMap(int[] arr) {
        Map<Integer, Integer>map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                   count++;
                }
            }
            map.put(arr[i], count);
            count = 0;
        }
        System.out.println(map);
    }
}
