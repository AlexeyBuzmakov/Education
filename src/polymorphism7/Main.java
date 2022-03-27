package polymorphism7;

public class Main {
    public static void main(String[] args) {
        Polynomial formulaOne = new FormulaOne();
        Polynomial formulaTwo = new FormulaTwo();
        Polynomial formulaThree = new FormulaThree();
        Evaluator.num = 10;
        Polynomial[]polynomials = {formulaOne, formulaTwo, formulaThree};
        System.out.println(Evaluator.calculateSumAllFormulas(polynomials));
    }
}
