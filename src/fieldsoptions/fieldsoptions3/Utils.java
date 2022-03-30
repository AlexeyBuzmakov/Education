package fieldsoptions.fieldsoptions3;

public class Utils {

    public int sumArrayNumbers(int[]arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int squareNumber(int num) {
        return num * num;
    }

    public String convertIntString(int num) {
        return num + " ";
    }

    public boolean checkRangeNumber(int num) {
        return num > 0 && num < 100;
    }
}
