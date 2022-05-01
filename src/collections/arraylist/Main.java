package collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list2 = Arrays.asList("15", "17", "98", "2", "16", "33", "87","111", "55", "13", "22");
        ArrayList<String>list = new ArrayList<>();
        list.addFirst("9");
        list.addLast("8");
        list.addLast("7");
        list.addLast("1");
        list.addLast("5");
        list.add("33", 1);
        list.removeLast();
        list.removeFirst();
        list.remove(2);
        System.out.println(list.get(2));
        list.set("9", 1);
        System.out.println(list.find("33"));
        list.trimToSize();
        list.ensureCapacity(12);
        list.sort();
        list.addAll(list2);
        System.out.println(list);

    }
}
