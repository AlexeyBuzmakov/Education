package classarrays;

public class Main {
    public static void main(String[] args) {
        UtilsArray utilsArray = new UtilsArray();
        int[]arr = {3, 11, 7, 4, 27, 82, 9};
        String[]arr2 = {"j", "w", "c", "z", "b", "q", "t"};
        String[]arr3 = {"Bob", "Alex", "Jake", "Jessica"};
        String[]arr4 = {"Bob", "Alex", "Will", "Jessica"};
        int[]arr7 = new int[5];
        utilsArray.sortElementsAscendingOrder(arr);
        utilsArray.sorElementsAlphabetically(arr2);
        System.out.println(utilsArray.checkEqualityArrays(arr3,arr4));
        System.out.println(utilsArray.checkEqualityDipArrays());
        utilsArray.fillingElement(arr7);
        utilsArray.cloningArray(arr);
        utilsArray.minMaxElementArray(arr);
    }
}
