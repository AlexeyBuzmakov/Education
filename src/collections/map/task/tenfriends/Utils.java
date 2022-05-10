package collections.map.task.tenfriends;

import java.util.Arrays;

public class Utils {

    public static void createArray(int[]arr) {
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = (int)(1 + Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int maxRepetNumber(int[]arr) {
        int maxRepet = 0;
        int countRepet = 0;
        int number = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                   countRepet++;
                }
            }
            if(countRepet > maxRepet) {
                maxRepet = countRepet;
                number = arr[i];
            }
        }
        return number;
    }
}
