package abstraction11;

public class Calculator implements Matrix{

    @Override
    public double calculateSumMatrixElement(int[][]matrix) {
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    @Override
    public double calculateMeanMatrixElement(int[][]matrix) {
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum / matrix.length;
    }

    @Override
    public void getMatrixRow(int[][]matrix, int lineNumber) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == lineNumber) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
