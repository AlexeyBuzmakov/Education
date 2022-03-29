package arrays1;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        String[][]arr = {{"Dog", "Cat", "Monkey"},{"Lion", "Snake", "Bird"}};
        String[][]arr2 = {{"Dog", "Cat", "Monkey"},{"Lion", "Snake", "Bird"}};
        System.out.println(array.checkEqualityDipArrays(arr, arr2));
    }
}
