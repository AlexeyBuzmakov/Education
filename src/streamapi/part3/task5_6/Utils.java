package streamapi.part3.task5_6;

import java.util.Arrays;

public class Utils {
    public static void sorting(int[]arr) {
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
    }
}
