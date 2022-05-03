package collections.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.addFirst("Java");
        list.addFirst("Java");
        list.addFirst("Java");
        list.addFirst("Python");
        list.addFirst("JavaScript");
        list.addFirst("C++");
        list.addFirst("C#");
        list.addFirst("Ruby");
        list.add("Scala", 3);
        list.addLast("Swift");
        list.removeFirst();
        list.remove(3);
        list.removeLast();
        list.addFirst("Java");
//        list.removeElement("Java");
        System.out.println(list.find("Java"));
        System.out.println(list.sum());
        System.out.println(Arrays.toString(list.toArray()));
        list.push("Kotlin");
        System.out.println(list.pop());
        System.out.println(list.peek());
    }
}
