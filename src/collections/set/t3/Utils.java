package collections.set.t3;

import java.util.*;

public class Utils {
    public static int countPair(int[] arr, int num) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;
        for(int nums : arr) {
            if(pairs.containsKey(nums)) {
                pairs.put(nums, pairs.get(nums) + 1);
            }
            else {
                pairs.put(nums, 1);
            }
            if(pairs.containsKey(num - nums)) {
                count += pairs.get(num - nums);
            }
        }
        return count;
    }
}
