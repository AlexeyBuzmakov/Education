package polymorphism6;

public class Evaluator {
    public static int a;


    public static int calculate(Polynomial polynomial) {
        return polynomial.evaluate(a);
    }
}
