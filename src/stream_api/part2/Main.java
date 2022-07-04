package stream_api.part2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = List.of(5, 16, 22, 81, 13, 27, 55);
        Person[]person = {new Person(19), new Person(22), new Person(17), new Person(27)};
        List<Integer>list2 = List.of(55,55,10,15,20,15);

        System.out.println(Utils.getMax(list));
        System.out.println(Utils.getMin(list));
        System.out.println(Utils.getAverage(list));

        System.out.println(Utils.checkAgeAllUseStream(person));
        System.out.println(Utils.checkAgeAllUseCycle(person));
        System.out.println(Utils.checkAgeOneUseStream(person));
        System.out.println(Utils.checkAgeOneUseCycle(person));

        Utils.removeRepeat(list2);
        Utils.removeRepeatTwo(list2);
        Utils.removeRepeatSorted(list2);

        Utils.sequenceGeneration();


    }
}
