package collections.additionally.t2;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = List.of(3, 11, 19, 22, 37, 41, 58, 72, 95, 103);
        System.out.println(Collections.binarySearch(list, 37));
    }
}
