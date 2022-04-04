package exception.exception5;

public class Calculator {
    public int calculateValue(int a, int b, char op) {
        if(b == 0 && op == '/') {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
        switch(op) {
            case '+' -> {return a + b;}
            case '-' -> {return a - b;}
            case '*' -> {return a * b;}
            case '/' -> {return a / b;}
        }
        return 0;
    }
}
