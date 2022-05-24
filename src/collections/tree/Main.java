package collections.tree;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(33);
        treeSet.add(92);
        treeSet.add(27);
        treeSet.add(56);
        treeSet.add(111);
        treeSet.add(2);
        treeSet.add(64);
        treeSet.add(38);
        treeSet.add(51);
        treeSet.add(116);

//        System.out.println(treeSet.contains(800));

        treeSet.remove(33);

        treeSet.printTree();

    }
}
