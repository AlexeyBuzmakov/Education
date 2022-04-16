package generics2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ArrayList<Double>list2 = new ArrayList<>();
        list2.add(10.0);
        list2.add(20.0);
        list2.add(30.0);

        Utils.printNumberList(list);
        System.out.println(Utils.calculateSumElements(list));
        System.out.println(Utils.calculateSumArrays(list, list2));
    }
}
