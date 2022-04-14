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
        System.out.println(list);
        Util.getElementArray(list, 0);

        BankAccount<String> bankAccount = new BankAccount<>();
        System.out.println(bankAccount.showBalance("1000 RUB"));

        MyArrayList<Integer> array = new MyArrayList<>(new Integer[10]);
        array.addElementArray(6);
        array.removeElementArray(3);
        array.removeFirstElementArray();
        array.getElementArray(3);
        array.changeElementArray(3,10);

    }
}
