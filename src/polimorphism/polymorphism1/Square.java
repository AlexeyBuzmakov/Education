package polimorphism.polymorphism1;

public class Square extends Figure{

    private int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
