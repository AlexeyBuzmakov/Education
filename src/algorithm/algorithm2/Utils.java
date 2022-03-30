package algorithm.algorithm2;

public class Utils {
        public void fillArrayCharacter(int height, int length) {
            int[][]arr = new int[height][length];
            for(int i = height - 1; i >= 0; i--) {
                for(int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = j;
                    if(j < i) {
                        arr[i][j] = i;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public void fillArrayCharacter2(int height , int length) {
            int[][]arr = new int[height + 1][length + 1];
            for(int i = height - 1; i >= 0; i--) {
                for(int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = i;
                    if(j > i) {
                        arr[i][j] = j;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

