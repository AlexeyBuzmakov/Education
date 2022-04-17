package generics.generics2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ArrayList<Number>list2 = new ArrayList<>();
        list2.add(50.0);
        list2.add(60.0);
        list2.add(70.0);

        Utils.printNumberList(list);
        System.out.println(Utils.calculateSumElements(list));
        System.out.println(Utils.calculateSumArrays(list, list2));
        Utils.Pecs(list, list2);
        Utils.sameAvg(list, list2);
    }
}
