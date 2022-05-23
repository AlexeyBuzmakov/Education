package collections.tree.t3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 23);
        Student student2 = new Student("Mark", 19);

        Set<Student>treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        treeSet.add(student);
        treeSet.add(student2);
        System.out.println(treeSet);
    }
}
