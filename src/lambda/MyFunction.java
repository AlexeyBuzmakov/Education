package lambda;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T name);
}
