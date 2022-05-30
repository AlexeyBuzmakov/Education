package collections.iterator.linked;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String>list = new MyLinkedList<>();
        list.addLast("Bob");
        list.addLast("Mike");
        list.addLast("John");
        list.addLast("Jack");
        list.addLast("Arnold");

        for(String element : list) {
            System.out.println(element);
        }
    }
}
