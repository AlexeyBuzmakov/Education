package exeption.exeption1;

public class Main {
    public static void main(String[] args) {

        int result = 0;
        try{
           result = Calculator.divisionNumbers(20,0, '/');
        }
        catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println(result);
        }
    }
}
