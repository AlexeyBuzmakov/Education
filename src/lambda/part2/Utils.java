package lambda.part2;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Utils {

    public static void implementationVoid(int num) {                                                               //2,3
        Consumer<String>consumer = x -> System.out.println(x);
        consumer.accept("Метод первый: " + num);
        consumer.accept("Метод второй: " + num);
        consumer.accept("Метод третий: " + num);
        consumer.accept("Метод четвертый: " + num);
        consumer.accept("Метод пятый: " + num);
    }

    public static<T, R> String stringConversion(T arg1, R arg2, BiFunction<T, R, String>function) {                  //5
        return function.apply(arg1, arg2);
    }
}
