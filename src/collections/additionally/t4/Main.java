package collections.additionally.t4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = {32, 18, 84, 18, 11, 32, 95, 46, 46, 94, 13};

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int[] newArr = new int[max - min + 1];

        for(int num : arr){
            newArr[num - min]++;
        }

        int arrayIndex = 0;
        for(int i = 0; i < newArr.length; i++) {
            for(int j = 0; j < newArr[i]; j++) {
                arr[arrayIndex++] = i + min;
                System.out.print(i + min + " ");
            }
        }
    }
}
