package generics.generics3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Utils<Integer>utils = new Utils<>();
        utils.compare(30, 10);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(125);
        list.add(27);
        list.add(84);
        list.add(192);
        utils.sort(list);
    }
}
