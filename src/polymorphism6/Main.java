package polymorphism6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Polynomial polynomial = null;
        Polynomial formulaOne = new FormulaOne();
        Polynomial formulaTwo = new FormulaTwo();
        Polynomial formulaThree = new FormulaThree();
        Evaluator evaluator = new Evaluator();
        Evaluator.a = 10;
        Scanner scanner = new Scanner(System.in);
        int chooseFormula = scanner.nextInt();
        switch(chooseFormula) {
            case 1 -> polynomial = formulaOne;
            case 2 -> polynomial = formulaTwo;
            case 3 -> polynomial = formulaThree;
            default -> System.out.println("Некоректный ввод");
        }
        System.out.println(Evaluator.calculate(polynomial));

    }
}
