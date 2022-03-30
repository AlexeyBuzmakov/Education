package polimorphism.polymorphism7;

public class Evaluator {
    public static int num;

    public static int calculateSumAllFormulas(Polynomial[] polynomials) {
        int sum = 0;
        for(Polynomial polynomial : polynomials) {
            sum += polynomial.evaluate(num);
        }
        return sum;
    }
}
