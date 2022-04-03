package exeption.exeption1;

public class Calculator {
    public static int divisionNumbers(int a, int b, char op) {
        switch(op) {
            case '/' -> {return a / b;}
            case '*' -> {return a * b;}
            case '+' -> {return a + b;}
            case '-' -> {return a - b;}
        }
        return 0;
    }
}
