package algorithm.algorithm7;

public class Main {
    public static void main(String[] args) {
        UtilsArray util = new UtilsArray();
        int[]arr = {5, 16, 22, 11, 16, 11, 16};
        int[]arr2 = {5, 3, 8, 1, 10, 7, 4, 2, 9};
        util.determineMostFrequentElement(arr);
        util.determineMissingElement(arr2);
        util.outputDiagonalElementsMatrix(7);
        util.fillMatrixCertainType();
    }
}
