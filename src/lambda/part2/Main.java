package lambda.part2;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Set<Person>personsTree = new TreeSet<>((Person o1, Person o2) -> {                                         //1.1
            if (o1.getAge() != o2.getAge()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        personsTree.add(new Person("Bob", 22));
        personsTree.add(new Person("Alex", 27));
        personsTree.add(new Person("Piter", 25));

        personsTree.add(new Person("Yan", 17));
        personsTree.add(new Person("Angela", 31));
        personsTree.add(new Person("Mike", 25));
        System.out.println(personsTree);

        List<Person>personsList = new ArrayList<>(personsTree);                                                    //1.2
        personsList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        System.out.println(personsList);

        BiFunction<Integer, Character, String>function = (x, y) -> x.toString().concat(y.toString());
        System.out.println(Utils.stringConversion(5, 'A', function));

        Utils.implementationVoid(100);

        Function<Integer, String>func = x -> String.valueOf(x);                                                      //4
        Random random = new Random();
        Supplier<Integer>supplier = () -> random.nextInt();
        Consumer<List<Person>>operator = x -> x.clear();
        BiFunction<String, Integer, Person>fun = (x, y) -> new Person(x, y);

    }
}
