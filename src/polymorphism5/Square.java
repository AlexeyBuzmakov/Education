package polymorphism5;

public class Square extends Figure {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
