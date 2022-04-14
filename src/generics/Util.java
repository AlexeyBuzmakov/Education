package generics;

import java.util.ArrayList;

public class Util {

    public static <T> void showArray(ArrayList<T> list) {
        System.out.println(list);
    }

    public static <T> void fillArray(ArrayList<T> list, T element) {
        for(int i = 0; i < list.size(); i++) {
            list.add(i, element);
        }
    }

    public static <T> void addElementArray(ArrayList<T> list, T element) {
        list.add(element);
    }

    public static <T> void getElementArray(ArrayList<T> list, int index) {
        list.get(index);
    }

}
