package classarrays;

import java.util.Arrays;
import java.util.Scanner;

public class UtilsArray {

    public static void sortElementsAscendingOrder(int[]arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        }

    public static void sorElementsAlphabetically(String[]arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean checkEqualityArrays(String[]arr, String[]arr2) {
        return Arrays.equals(arr, arr2);
    }

    public static boolean checkEqualityDipArrays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер первого массива");
        int columnArr = scanner.nextInt();
        int lengthArr = scanner.nextInt();
        int[][]arr = new int[columnArr][lengthArr];
        System.out.println("Введите элементы первого массива");
        for(int i = 0; i < lengthArr; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введите размер второго массива");
        int columnArr2 = scanner.nextInt();
        int lengthArr2 = scanner.nextInt();
        int[][]arr2 = new int[columnArr2][lengthArr2];
        System.out.println("Введите элементы второго массива");
        for(int i = 0; i < lengthArr2; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        return Arrays.deepEquals(arr, arr2);
    }

    public static void fillArray(int[]arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элемент для заполнения массива");
        int fillElement = scanner.nextInt();
        Arrays.fill(arr,fillElement);
        System.out.println(Arrays.toString(arr));
    }

    public static void cloningArray(int[]arr) {
        int[]arr2 = arr.clone();
        System.out.println(Arrays.toString(arr2));
    }

    public static void minMaxElementArray(int[]arr) {
        Arrays.sort(arr);
        System.out.println("Минимальнное значение массива: " + arr[0] +
        " Максимальное значение массива: " + arr[arr.length - 1]);
    }
}

