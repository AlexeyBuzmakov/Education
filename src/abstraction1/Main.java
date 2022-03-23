package abstraction1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("green", 5);
        Circle circle = new Circle("red", 4);
        System.out.println("Цвет окружности " + circle.getColor());
        System.out.println("Радиус окружности = " + circle.getRadius());
        System.out.println("Площадь окружности = " + circle.areaFigure());
        System.out.println("Периметр окружности = " + circle.perimeterFigure());
        System.out.println("Цвет квадрата " + square.getColor());
        System.out.println("Диагональ квадрата = " + square.squareDiagonal());
        System.out.println("Площадь квадрата = " + square.areaFigure());
        System.out.println("Периметр квадрата = " + square.areaFigure());
    }
}
