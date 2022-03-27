package polymorphism5;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Figure rectangle = new Rectangle(4, 4);
        Figure circle = new Circle(5);
        Figure triangle = new Triangle(5, 5, 5, 3);
        Figure square = new Square(7);
        Figure[]figure = {rectangle,circle,triangle,square};
        System.out.println(calculator.calculateAreaFigure(figure));
    }
}
