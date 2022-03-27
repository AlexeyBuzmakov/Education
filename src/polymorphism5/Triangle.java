package polymorphism5;

public class Triangle extends Figure {
    private int side1;
    private int side2;
    private int side3;
    private int height;

    public Triangle(int side1, int side2, int side3, int height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return side1 * height;
    }
}
