package streamapi.part3.task6;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[]array = new int[10_000_000];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        List<Car> list = List.of(new Car("BMW", "X6", 500),
                                 new Car("Mazda", "RX7", 400),
                                 new Car("Mercedes", "GLC", 750),
                                 new Car("BMW", "Z4", 400),
                                 new Car("Mercedes", "Compressor", 550),
                                 new Car("Mazda", "CX5", 400));
        Utils.sort(array);
        Utils.addition(array);
        Utils.grouping(list);

    }
}
