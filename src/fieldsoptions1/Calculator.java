package fieldsoptions1;

public class Calculator {

    public int additionCalculate(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractionCalculate(int num1, int num2) {
        return num1 - num2;
    }

    public int squareSubtractionCalculate(int num1, int num2) {
        return (num1 - num2) * (num1 - num2);
    }

    public double piMultiplicationCalculate(int num1, int num2) {
        return num1 * num2 * Math.PI;
    }

    public void printNumbers(int num1, int num2) {
        System.out.println(num1 + " " + num2);
    }
}
