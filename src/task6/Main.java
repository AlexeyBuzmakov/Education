package task6;

import task6.figure.Circle;
import task6.figure.Figure;
import task6.figure.Square;

public class Main {
    public static void main(String[] args) {
        UtilsFigure utils = new UtilsFigure();
        Figure circle = new Circle();
        Figure circle1 = new Circle();
        Figure circle2 = new Circle();
        Figure circle3 = new Circle();
        Figure square = new Square();
        Figure square1 = new Square();
        Figure square2 = new Square();
        Figure square3 = new Square();
        utils.countFigure(circle, circle1, circle2, circle3, square, square1, square2, square3);
    }
}
