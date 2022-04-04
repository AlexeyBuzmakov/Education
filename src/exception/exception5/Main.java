package exception.exception5;

public class Main {
    public static void main(String[] args) {
        /* можно не прописывать throws ArithmeticException в Main так как оно является непроверяемым */
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculateValue(5,0,'/'));
    }
}
