package collections.list;

import java.util.*;

public class UtilsList {

    public static double sum(List<Number> list) {                       //1.1
        double sum = 0;
        for(Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static double sumEven(List<Number>list) {                    //1.2
        double sum = 0;
        for(int i = 1; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
            i++;
        }
        return sum;
    }

    public static int countRepet(List<Number>list, Number value) {       //1.3
        int count = 0;
        for(Number element : list) {
            if(element.equals(value)) {
               count++;
            }
        }
        return count;
    }

    public static double max(List<Number>list) {                         //1.4
        double max = Double.MIN_VALUE;
        for(Number num : list) {
            if(num.doubleValue() > max) {
               max = num.doubleValue();
            }
        }
        return max;
    }

    public static double min(List<Number>list) {                         //1.5
        double min = Double.MAX_VALUE;
        for(Number num : list) {
            if(num.doubleValue() < min) {
                min = num.doubleValue();
            }
        }
        return min;
    }

    public static void removeRepet(List<Number>list) {            //2
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public static Number[] conversionToArray(List<Number>list) {          //3
        Number[]arr = new Number[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static List<Number> conversionToList(Number[]arr) {            //4
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void removeEveryThird(List<Number>list) {       //5
        for(int i = 2; i < list.size(); i += 2) {
            list.remove(i);
        }
    }

    public static void removeFirstLast(List<Number>list) {        //6
        list.remove(0);
        list.remove(list.size() - 1);
    }

    public static void insertMiddle(List<Number> list, Number[] arr) {         //7
        int middle = list.size() / 2;
        for (Number number : arr) {
            list.add(middle, number);
            middle++;
        }
        System.out.println(list);
    }

    public static void removeIdenticalRow(List<Number>list) {     //8
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).equals(list.get(i + 1))) {
               list.remove(i + 1);
               i--;
            }
        }
    }

    public static void increaseCapacity(ArrayList<Number>list) {          //9
        list.ensureCapacity(1_000_000);
    }

    public static void merger(List<Number>arrayList, List<Number>linkedList) {     //10
        int l = arrayList.size();
        arrayList.addAll(linkedList);
        for(int i = 0; i < l; i++) {
            linkedList.add(arrayList.get(i));
        }
    }

    @SafeVarargs
    public static <E> List<E> of(E...elements) {                            //11
        return List.of(elements);
    }

    public static void fillArray(Number[]arr) {                            //12
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
           arr[i] = random.nextInt(100);
        }
    }

    public static Number[] trimToSize(Number[] arr) {
        int count = 0;
        int i = arr.length - 1;
        while(arr[i] == null) {
           i--;
           count++;
        }
        Number[] array = new Number[arr.length - count];
        System.arraycopy(arr, 0, array, 0, array.length);
        return array;
    }
}
