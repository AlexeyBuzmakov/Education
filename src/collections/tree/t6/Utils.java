package collections.tree.t6;

import java.util.Set;

public class Utils {

    public static long time(Set<Integer> set, int numb) {
        long startTime = System.nanoTime();
        if(set.contains(numb)) {
            return System.nanoTime() - startTime;
        }
        return 0;
    }
}
