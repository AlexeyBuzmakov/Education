package abstraction12;

public interface Consumer {

    default double calculate(int num1, int num2, String operation) {
        switch (operation) {
            case "+" -> {return num1 + num2;}
            case "-" -> {return num1 - num2;}
            case "*" -> {return num1 * num2;}
            case "/" -> {return num1 / num2;}
        }
        return 0;
    }
}
