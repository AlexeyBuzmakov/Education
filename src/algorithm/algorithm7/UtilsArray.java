package algorithm.algorithm7;

public class UtilsArray {

    public void determineMostFrequentElement(int[]arr) {
        int a = 0;
        while(a <= arr.length) {
            int mostFrequentElement = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int currentElement = arr[i];
                    
                    }
                }
            a++;
            }
        }

    public void determineMissingElement(int[]arr) {
        int a = 0;
        int sumFirstTenNumbers = 0;
        while(a <= 10) {
            sumFirstTenNumbers += a;
            a++;
        }

        int sumElementsArray = 0;
        for(int i = 0; i < arr.length; i++) {
            sumElementsArray += arr[i];
        }
        int missingElement = sumFirstTenNumbers - sumElementsArray;
        System.out.println("Пропущено число: " + missingElement);
    }

    public void outputDiagonalElementsMatrix(int a) {
        char[][]matrix = new char[a][a];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ' ';
                if(i == j || i + j == matrix.length -1) {
                    matrix[i][j] = 'X';
                }
                System.out.print(matrix[i][j] + " ");
                if(j == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public void fillMatrixCertainType() {
        char[][]matrix = new char[3][7];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[i].length; j++) {
                matrix[i][j] = ' ';
                if(j == 0) {
                    matrix[i][j] = '[';
                }
                else if(j == matrix[i].length -1) {
                    matrix[i][j] = ']';
                }
                else if(j % 2 == 0) {
                    matrix[i][j] = ',';
                }
                else if(i == 0 && j < 6 || i == 1 && j < 4 || i == 2 && j < 2) {
                    matrix[i][j] = 'X';
                }
                System.out.print(matrix[i][j]);
                if(j == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
