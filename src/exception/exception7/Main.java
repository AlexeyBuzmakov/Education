package exception.exception7;

public class Main {
    public static void main(String[] args) {

        int result = 0;
        try {
            result = Calculator.calculator(20, 0, '/');
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            throw exception;
        }
    }
}
