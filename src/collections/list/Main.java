package collections.list;

public class Main {
    public static void main(String[] args) {
        List<Integer>arrayList = new ArrayList<>();
        arrayList.addLast(13);
        arrayList.addLast(25);
        arrayList.addLast(38);
        arrayList.addLast(25);
        arrayList.addLast(13);
        arrayList.addLast(184);
        arrayList.addLast(216);
        arrayList.addLast(38);
        arrayList.addLast(81);
        arrayList.addLast(13);

        List<Integer>linkedList = new LinkedList<>();
        linkedList.addLast(66);
        linkedList.addLast(91);
        linkedList.addLast(162);
        linkedList.addLast(15);
        linkedList.addLast(66);
        linkedList.addLast(45);
        linkedList.addLast(216);
        linkedList.addLast(11);
        linkedList.addLast(91);
        linkedList.addLast(30);
        linkedList.

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}
