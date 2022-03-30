package algorithm.algorithm4;

public class Utils {
        public void outputFigure(int h, int l) {
            char[][]arr = new char[h][l];
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(j == arr.length - 1) {
                        arr[i][j] = '-';
                    }
                    else if(i == j) {
                        arr[i][j] = '+';
                    }
                    else {
                        arr[i][j] = ' ';
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void outputFigure2(int h, int l) {
            char[][]arr = new char[h][l];
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(i > j) {
                        arr[i][j] = ' ';
                    }
                    if(j >= i) {
                        arr[i][j] = '+';
                    }
                    if(i == 0 && j != 0) {
                        arr[i][j] = '-';
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void outputFigure3(int h, int l) {
            char[][]arr = new char[h][l];
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(i < j) {
                        arr[i][j] = '-';
                    }
                    if(i == 0 && j == 0 || i == 0 && j == l - 1 || i == 1 && j < l - 1) {
                        arr[i][j] = '+';
                    }
                    if(j <= i && i != 0) {
                        arr[i][j] = ' ';
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void outputFigure4(int h, int l) {
            char[][]arr = new char[h][l];
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    if(i == 0 && j > 2 || i == 2 && j > 1|| j == l-1 && i == 1 || j == 0 && i == 0) {
                        arr[i][j] = '+';
                    }
                    else if(j < i) {
                        arr[i][j] = ' ';
                    }
                    else {
                        arr[i][j] = '-';
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

