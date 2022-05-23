package collections.tree.t2;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[]arr = {91, 65, 91, 19, 65, 4, 0, 4, 88, 91, 300};
        Map<Integer, Integer>treeMap = new TreeMap<>();

        for(int num : arr) {
            if(treeMap.containsKey(num)) {
                treeMap.put(num, treeMap.get(num) + 1);
            }
            else {
                treeMap.put(num, 1);
            }
        }
        System.out.println(treeMap);
    }
}
