package bigo;

import java.util.Arrays;

public class UtilsBigO {

    public double average(int[]arr) {                        // big O = O(n)
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public double maxElement(int[]arr) {                     // big O = O(n)
        double max = Integer.MIN_VALUE;
        for (int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public void sort(int[]arr) {                             //big O = O(n^2)
        int buf;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                   buf = arr[j];
                   arr[j] = arr[i];
                   arr[i] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public double getElement(int[]arr, int index) {              //big O = O(1)
        if(index > 0 && index < arr.length) {
            return arr[index];
        }
        return -1;
    }

    public int count(int[]arr, int value) {                      // метод считает количество повторений в массиве элемента, переданного через аргумент
        int count = 0;                                           // big O = O(n)
        for(int num : arr) {
            if(num == value) {
                count++;
            }
        }
        return count;
    }

    public void task7() {                                   // big O = O(n * 10) = O(n)
        int n = 100;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println(i + " : " + j);
            }
        }
    }

    public void task8() {                                   //big 0 = O(n * 1_000_000) = O(n)
        int n = 100;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 1_000_000; j++) {
                System.out.println(i + " : " + j);
            }
        }
    }

    public void task9(int n) {                              //big O = O(log n)
        int count = 0;
        while(n > count) {
            n /= 2;
            count++;
        }
    }
}
