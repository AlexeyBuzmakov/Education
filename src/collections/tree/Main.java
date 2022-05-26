package collections.tree;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(15);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(14);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(4);

        System.out.println(treeSet.contains(38));

        System.out.println(treeSet.remove(2));

        treeSet.printTree();
    }
}
