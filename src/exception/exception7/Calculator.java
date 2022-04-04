package exception.exception7;

public class Calculator {
    public static int calculator(int a, int b, char op) {
        switch(op) {
            case '/' -> {return a / b;}
            case '*' -> {return a * b;}
            case '+' -> {return a + b;}
            case '-' -> {return a - b;}
        }
        return 0;
    }
}
