package collections.additionally.t4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[]arr = {32, 18, 84, 18, 11, 32, 95, 46, 46, 94, 13};
        List<Integer>list = List.of(arr);
        List<Integer>list2 = new LinkedList<>(list);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
