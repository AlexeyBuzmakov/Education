package polymorphism1;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 5);
        Figure circle = new Circle(4);
        Figure triangle = new Triangle(5, 5, 5, 3);
        Figure square = new Square(7);

        Figure[]figure = {rectangle, circle, triangle, square};
            double totalPerimeter = 0;
            double totalArea = 0;
            for (Figure figures : figure) {
                totalPerimeter += figures.calculatePerimeter();
                totalArea += figures.calculateArea();
            }
        System.out.println("Общий периметр фигур " + totalPerimeter);
        System.out.println("Общая площадь фигур " + totalArea);
        }
    }
