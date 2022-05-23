package collections.tree.t4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 23);
        Student student2 = new Student("Mark", 19);
        Student student3 = new Student("John", 25);
        Student student4 = new Student("Mike", 18);

        Set<Student>treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        System.out.println(treeSet);
    }
}
