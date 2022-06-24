package lambda.part1;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T name);
}
