package class_arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = {3, 11, 7, 4, 27, 82, 9};
        String[]arr2 = {"j", "w", "c", "z", "b", "q", "t"};
        String[]arr3 = {"Bob", "Alex", "Jake", "Jessica"};
        String[]arr4 = {"Bob", "Alex", "Will", "Jessica"};
        int[]arr7 = new int[5];
        UtilsArray.sortElementsAscendingOrder(arr);
        UtilsArray.sorElementsAlphabetically(arr2);
        System.out.println(UtilsArray.checkEqualityArrays(arr3,arr4));
        System.out.println(UtilsArray.checkEqualityDipArrays());
        UtilsArray.fillArray(arr7);
        UtilsArray.cloningArray(arr);
        UtilsArray.minMaxElementArray(arr);
    }
}
