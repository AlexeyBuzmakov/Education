package algorithm.algorithm3;

public class Utils {
        public void printFirstElementsArray(int n) {
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
                if(i == 0) {
                    arr[0] = 1;
                    System.out.print(arr[0] + " ");
                    i++;
                }
                if(i == 1) {
                    arr[1] = 5;
                    System.out.print(arr[1] + " ");
                    i++;
                }
                arr[i] = arr[i - 1] + (arr[i - 1] - arr[i - 2] + 3);
                System.out.print(arr[i] + " ");
            }
        }
    }

