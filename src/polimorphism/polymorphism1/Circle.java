package polimorphism.polymorphism1;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
