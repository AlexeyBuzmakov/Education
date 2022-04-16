package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Identifier<Integer, String> identifier = new Identifier<>();
        identifier.showIdentifier(1,"Name");

        ArrayList<Integer> list = new ArrayList<>(20);
        Util.showArray(list);
        Util.fillArray(list, 1);
        Util.addElementArray(list, 5);
        Util.getElementArray(list, 0);

        BankAccount<String> bankAccount = new BankAccount<>("1000");

        MyArrayList<Integer> array = new MyArrayList<>(new Integer[10]);
        array.addElement(6);
        array.removeElement(3);
        array.removeFirstElement();
        array.getElement(3);
        array.changeElement(3,10);

    }
}
