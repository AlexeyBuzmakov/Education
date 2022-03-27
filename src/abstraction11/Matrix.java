package abstraction11;

public interface Matrix {

        default double calculateSumMatrixElement(int[][]matrix) {
            double sum = 0;
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }

        default double calculateMeanMatrixElement(int[][]matrix) {
            double sum = 0;
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
            }
            return sum / matrix.length;
        }

        default void getMatrixRow(int[][]matrix, int lineNumber) {
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    if(i == lineNumber) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
        }
    }

