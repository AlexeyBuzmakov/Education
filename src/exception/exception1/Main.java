package exception.exception1;

public class Main {
    public static void main(String[] args) {

        int result = 0;
        try{
           result = Calculator.calculator(20,4, '/');
            System.out.println(result);
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Помни что на 0 делить нельзя");
        }
    }
}
