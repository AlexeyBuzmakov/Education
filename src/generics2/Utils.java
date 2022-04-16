package generics2;

import java.util.ArrayList;

public class Utils <T>{

    public static void printNumberList(ArrayList<? extends Number>list) {
        System.out.println(list);
    }

    public static double calculateSumElements(ArrayList<? extends Number>list) {
        int sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static double calculateSumArrays(ArrayList<? extends Number>list, ArrayList<? extends Number>list2) {
        int sum = 0;
        for(Number num : list) {
            sum +=  num.doubleValue();
        }

        for(Number num2 : list2) {
            sum += num2.doubleValue();
        }
        return sum;
    }


}
