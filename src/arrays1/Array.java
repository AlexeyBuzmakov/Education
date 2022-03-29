package arrays1;

import java.util.Arrays;

public class Array {

    public void sortElementsAscendingOrder(int[]arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        }

    public void sorElementsAlphabetically(String[]arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public boolean checkEqualityArrays(String[]arr, String[]arr2) {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }

    public boolean checkEqualityDipArrays(String[][]arr, String[][]arr2) {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.deepEquals(arr, arr2);
    }


}

