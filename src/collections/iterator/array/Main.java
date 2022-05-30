package collections.iterator.array;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String>list = new MyArrayList<>();
        list.addLast("Moscow");
        list.addLast("Tyumen");
        list.addLast("Saint Petersburg");
        list.addLast("Omsk");
        list.addLast("Sochi");

        for(String element : list) {
            System.out.println(element);
        }
    }
}
