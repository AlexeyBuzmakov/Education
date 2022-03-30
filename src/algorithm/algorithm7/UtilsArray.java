package algorithm.algorithm7;

public class UtilsArray {

    public void determineMostFrequentElement(int[]arr) {
        int elementLotRepetition = 0;
        int cycleNumberMostRepetitions = 0;
        int numberRepetitionsCurrentCircle = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    numberRepetitionsCurrentCircle++;
                }
            }
            if(numberRepetitionsCurrentCircle > cycleNumberMostRepetitions) {
                cycleNumberMostRepetitions = numberRepetitionsCurrentCircle;
                elementLotRepetition = arr[i];
            }
            numberRepetitionsCurrentCircle = 0;
        }
        System.out.println("Элемент, встречающийся наибольшее количество раз: "+ elementLotRepetition +
        " количество повторений: " + (cycleNumberMostRepetitions + 1));

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
