package collections.linkedlist;

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
        list.removeElement("Java");
        list.printArray();
    }
}
