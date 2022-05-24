package collections.tree;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(13);
        treeSet.add(92);
        treeSet.add(27);
        System.out.println(treeSet.contains(92));

    }
}
