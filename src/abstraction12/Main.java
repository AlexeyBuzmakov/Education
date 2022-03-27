package abstraction12;

public class Main {
    public static void main(String[] args) {
        ArithmeticConsumer calc = new ArithmeticConsumer();
        double result = calc.calculate(7,7,"+");
        System.out.println(result);
    }
}
