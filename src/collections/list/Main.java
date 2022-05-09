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

        Vector<Integer>stack = new Stack<>();
        stack.push(15);
        stack.push(38);
        stack.push(91);
        stack.push(144);
        stack.push(13);
        stack.push(28);
        stack.push(96);
        stack.push(134);
        stack.push(37);
        stack.push(81);

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(stack);

    }
}
