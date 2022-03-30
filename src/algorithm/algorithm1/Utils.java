package algorithm.algorithm1;

    class Utils {
        public void outputFigure(int height) {
            int lengthArr = 2 * height - 1;
            char[][] arr = new char[height][lengthArr];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ((j + (i % 2)) % 2 == 0 && j >= i && j <= lengthArr - i) {
                        arr[i][j] = '*';
                        if(i != 0 && (j + (i % 2)) % 2 == 0 && j > i && j < lengthArr - (i + 1)) {
                            arr[i][j] = '@';
                        }
                    }
                    else {
                        arr[i][j] = ' ';
                    }
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
