package polymorphism7;

public class FormulaThree implements Polynomial{

    @Override
    public int evaluate(int x) {
        return (x * x * x) + (x * x) + x + 1;
    }
}

