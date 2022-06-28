package streamapi.part1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        double[][] matrix = {{5.5, 4.3, 6.7, 11.2}, {13.7, 8.1, 1.9, 4.5}};
        Student[] students = {new Student("Bob", Map.of("math", List.of(5, 4, 5, 3, 5),
                "geometry", List.of(4, 3, 5, 4, 3),
                "philosophy", List.of(5, 4, 5, 4, 4))),
                new Student("Alex", Map.of("anatomy", List.of(4, 5, 5, 4, 4),
                        "politicalScience", List.of(4, 5, 5, 4, 5),
                        "chemistry", List.of(4, 5, 4, 5, 4)))};

        Stream<Integer> collectionsStream = list.stream();                                                           //1
        IntStream arrayStream = Arrays.stream(arr);
        Stream<String> stream = Stream.of();

        Stream<Integer> streamNumbersOne = Stream                                                                    //2
                .iterate(0, x -> x + 1)
                .limit(1000)
                .filter(x -> Math.sqrt(x) % 1 == 0 && Math.sqrt(x) < 1000);
        streamNumbersOne.forEach(out::println);

        Stream<Integer> streamNumbersTwo = Stream                                                                    //3
                .iterate(new Random().nextInt(100), x -> new Random().nextInt(100))
                .limit(10)
                .sorted((x, y) -> Integer.compare(y, x))
                .skip(1);
        streamNumbersTwo.forEach(out::println);

        Stream<Integer> streamNumbersThree = Stream                                                                  //4
                .iterate(new Random().nextInt(10), x -> new Random().nextInt(10))
                .limit(1000)
                .sorted((x, y) -> Integer.compare(y, x))
                .skip(999);
        streamNumbersThree.forEach(out::println);


        Arrays.stream(matrix)                                                                                        //5
                .flatMap(array -> Arrays.stream(array).boxed())
                .map(x -> x * 2)
                .forEach(out::println);

        Arrays.stream(students)                                                                                      //6
                .flatMap(x -> x.getMarks().values().stream())
                .flatMap(Collection::stream)
                .forEach(out::print);

        Arrays.stream(students)                                                                                      //7
                .map(student -> student.getName() + ":" + student
                        .getMarks().values()
                        .stream()
                        .flatMap(Collection::stream)
                        .toList())
                .forEach(out::println);

        Arrays.stream(students)                                                                                      //8
                .filter(student -> student.getMarks().values().stream()
                        .flatMap(Collection::stream)
                        .allMatch(x -> x > 3))
                .forEach(out::println);

        List<String> list2 = new ArrayList<>();                                                                      //9
        Files.lines(Paths.get("Test.txt"))
                .forEach(list2::add);

        list2.stream()
                .skip(1)
                .map(x -> x.substring(x.indexOf(" ") + 1, x.lastIndexOf(" ")))
                .map(x -> x.substring(0, x.lastIndexOf(" ")))
                .forEach(out::println);


        list2.stream()
                .skip(1)
                .map(x -> x.substring(x.indexOf(" ") + 1, x.lastIndexOf(" "))
                        .split(" "))
                .forEach(x -> out.println(Arrays.toString(x)));

        list2.stream()
                .skip(1)
                .map(x -> x.split(" "))
                .map(x -> new Person(Integer.parseInt(x[0]), x[1], x[2], x[3].split("([,,])")))
                .forEach(out::println);

        //Algorithms
        String word = "abcdetyabcety";                                                                               //1
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int i = 0;
        while (i < word.length()) {
            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
                i++;
                continue;
            }
            map.put(word.charAt(i), 1);
            i++;
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                out.println(entry.getKey());
                break;
            }
        }

        int[] numbers = {2, 3, 1, 4, 5};                                                                             //2
        int mult = 1;
        for (Integer num : numbers) {
            mult *= num;
        }
        int[] multNumbers = new int[numbers.length];
        for (int j = 0; j < multNumbers.length; j++) {
            multNumbers[j] = mult / numbers[j];
            out.print(multNumbers[j] + " ");
        }
    }
}
