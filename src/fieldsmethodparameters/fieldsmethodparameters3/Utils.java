package fieldsmethodparameters.fieldsmethodparameters3;

public class Utils {

    public static int sumArrayNumbers(int[]arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int squareNumber(int num) {
        return num * num;
    }

    public static String convertIntString(int num) {
        return num + " ";
    }

    public static boolean checkRangeNumber(int num) {
        return num > 0 && num < 100;
    }
}
