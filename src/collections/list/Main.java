package collections.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UtilsList utils = new UtilsList();
        List<Number>arrayList = new ArrayList<>();
        List<Number>linkedList = new LinkedList<>();
        Integer[]arr = {5, 16, 93, 54, 111, 8, 37};

        utils.fillLists(arrayList, linkedList);

//        System.out.println(utils.sum(arrayList));
//        System.out.println(utils.sumEven(arrayList));
//        System.out.println(utils.countRepet(arrayList, 5));
//        System.out.println(utils.max(arrayList));
//        System.out.println(utils.min(arrayList));
//        System.out.println(utils.removeRepet(arrayList));
//        System.out.println(Arrays.toString(utils.conversionToArray(arrayList)));
//        System.out.println(utils.conversionToList(arr));
//        System.out.println(utils.removeEveryThird(linkedList));
//        System.out.println(utils.removeFirstLast(linkedList));
//        System.out.println(utils.insertMiddle(arrayList, arr));
//        System.out.println(utils.removeIdenticalRow(arrayList));
//        utils.increaseCapacity((ArrayList<Number>) arrayList);
//        utils.merger(arrayList, linkedList);
//        System.out.println(UtilsList.of(arrayList, linkedList));
//
//        Number[]array = new Number[100];
//        System.out.println(Arrays.toString(utils.fillArray(array)));
//        System.out.println(Arrays.toString(utils.trimToSize(array)));
    }
}
