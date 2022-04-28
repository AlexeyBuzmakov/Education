package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UtilsList {

    public double sum(List<Number> list) {                       //1.1
        double sum = 0;
        for(Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public double sumEven(List<Number>list) {                    //1.2
        double sum = 0;
        for(int i = 1; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
            i++;
        }
        return sum;
    }

    public int countRepet(List<Number>list, Number value) {       //1.3
        int count = 0;
        for(Number element : list) {
            if(element.equals(value)) {
               count++;
            }
        }
        return count;
    }

    public double max(List<Number>list) {                         //1.4
        double max = Double.MIN_VALUE;
        for(Number num : list) {
            if(num.doubleValue() > max) {
               max = num.doubleValue();
            }
        }
        return max;
    }

    public double min(List<Number>list) {                         //1.5
        double min = Double.MAX_VALUE;
        for(Number num : list) {
            if(num.doubleValue() < min) {
                min = num.doubleValue();
            }
        }
        return min;
    }

    public List<Number> removeRepet(List<Number>list) {            //2
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))) {
                    list.remove(list.get(j));
                }
            }
        }
        return list;
    }

    public Number[] conversionToArray(List<Number>list) {          //3
        Number[]arr = new Number[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public List<Number> conversionToList(Number[]arr) {            //4
        return new ArrayList<>(Arrays.asList(arr));
    }

    public List<Number> removeEveryThird(List<Number>list) {       //5
        for(int i = 2; i < list.size(); i++) {
            list.remove(i);
            i = i + 2;
        }
        return list;
    }

    public List<Number> removeFirstLast(List<Number>list) {        //6
        list.remove(0);
        list.remove(list.size() - 1);
        return list;
    }

    public List<Number> insertArray(List<Number> list, Number[] arr) {         //7
        int l = list.size() / 2;                                               // тут должно быть решение получше
        for(int i = 0; i < arr.length; i++) {
            list.add(null);
        }
        int j = 0;
        for (int i = l; i < l + arr.length; i++) {
            if(j < l) {
                list.set(list.size() - l + j, list.get(i));
            }
            list.set(i, arr[j]);
            j++;
        }
        return list;
    }

    public List<Number> removeIdenticalRow(List<Number>list) {     //8
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).equals(list.get(i + 1))) {
               list.remove(i);
            }
        }
        return list;
    }

    public void increaseCapacity(ArrayList<Number>list) {          //9
        list.ensureCapacity(1_000_000);
    }

    @SafeVarargs
    public static <E> List<E> of(E...elements) {                   //10
        return List.of(elements);
    }

    public List<Number> trimToSize() {                            //11
        Random random = new Random();
        ArrayList<Number>list = new ArrayList<>();
        list.ensureCapacity(50);
        int size = random.nextInt(50);
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        list.ensureCapacity(list.size());
        return list;
    }
}
