package generics.generics2;

import java.util.ArrayList;

public class Utils{

    public static void printNumberList(ArrayList<? extends Number>list) {
        System.out.println(list);
    }

    public static double calculateSumElements(ArrayList<? extends Number>list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static double calculateSumArrays(ArrayList<? extends Number>list, ArrayList<? extends Number>list2) {
        double sum = 0;
        for(Number num : list) {
            sum += num.doubleValue();
        }

        for(Number num2 : list2) {
            sum += num2.doubleValue();
        }
        return sum;
    }

    public static void Pecs(ArrayList<? extends Number>list, ArrayList<? super Number>list2) {
        list2.addAll(list);
    }

    public static double average(ArrayList<? extends Number>list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum / list.size();
    }

    public static void sameAvg(ArrayList<? extends Number>list, ArrayList<? extends Number>list2) {
        if(average(list) == average(list2)) {
            System.out.println("Среднее значение списков одинаковое");
        }
        else {
            System.out.println("Среднее значение списков разное");
        }
    }
}
