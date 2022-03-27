package polymorphism7;

public class FormulaTwo implements Polynomial{

    @Override
    public int evaluate(int x) {
        return (x * x) + x + 1;
    }
}

