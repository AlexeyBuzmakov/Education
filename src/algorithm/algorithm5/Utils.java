package algorithm.algorithm5;

public class Utils {
        public void outputFirstElementsSubsequence(int n) {
            int[]arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
                if(i == 0) {
                    arr[0] = 0;
                    System.out.print(arr[0] + " ");
                    i++;
                }
                if(i == 1) {
                    arr[1] = 1;
                    System.out.print(arr[1] + " ");
                    i++;
                }
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.print(arr[i] + " ");
            }
        }
    }
