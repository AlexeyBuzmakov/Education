package algorithm.algorithm7;

public class UtilsArray {

    public static void determineMostFrequentElement(int[]arr) {
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

    public static void determineMissingElement(int[]arr) {
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

    public static void outputDiagonalElementsMatrix(int a) {
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

    public static void fillMatrixCertainType(int a) {
        char[][]matrix = new char[a][a];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[i].length; j++) {
                matrix[i][j] = ' ';
                if(i + j < matrix.length) {
                    matrix[i][j] = 'X';
                }
                System.out.print(matrix[i][j] + " ");
                if(j == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}
