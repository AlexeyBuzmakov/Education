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
        Student student5 = new Student("Elvis", 19);

        Set<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() != o2.getAge()) {
                    return Integer.compare(o2.getAge(), o1.getAge());
                }
                return o1.getName().compareTo(o2.getName());

            }
        });

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println(treeSet);
    }
}
