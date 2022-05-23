package collections.tree.t6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer>hashSet = new HashSet<>();

        int num = 0;
        while(hashSet.size() < 10_000_000) {
            hashSet.add(num);
            num++;
        }

        Set<Integer>treeSet = new TreeSet<>(hashSet);

        int numb = random.nextInt(10_000_000);

        System.out.println("Время поиска в HashSet: " + Utils.time(hashSet, numb) + " наносекунд");
        System.out.println("Время поиска в TreeSet: " + Utils.time(treeSet, numb) + " наносекунд");
    }
}
