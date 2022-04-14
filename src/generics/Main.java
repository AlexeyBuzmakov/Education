package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Identifier<Integer, String> identifier = new Identifier<>();
        identifier.showIdentifier(1,"Name");

        ArrayList<Integer> list = new ArrayList<>();
        UtilArray.showArray(list);
        UtilArray.fillArray(list, 1);
        UtilArray.addElementArray(list, 5);
        UtilArray.getElementArray(list, 1);

        BankAccount<String> bankAccount = new BankAccount<>();
        System.out.println(bankAccount.showBalance("1000 RUB"));

        MyArrayList<Integer> array = new MyArrayList<>(new Integer[10]);

    }
}
