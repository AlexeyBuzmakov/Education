package bigo;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 16, 111, 8, 45, 2, 92};
        UtilsBigO util = new UtilsBigO();
        System.out.println(util.average(arr));
        System.out.println(util.maxElement(arr));
        util.sort(arr);
        System.out.println(util.getElement(arr, 3));
        System.out.println(util.count(arr,2));
        util.task7();
        util.task8();

    }
}
