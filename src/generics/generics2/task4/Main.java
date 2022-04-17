package generics.generics2.task4;

import generics.generics2.task4.figure.Circle;
import generics.generics2.task4.figure.Figure;
import generics.generics2.task4.figure.Square;
import generics.generics2.task4.figure.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(3.0);
        Figure square = new Square(5.0);
        Figure triangle = new Triangle(5.0,3.0);
        ArrayList<Figure>figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);
        Calculator calculator = new Calculator();
        double figuresArea = calculator.figuresArea(figures);
        System.out.println(figuresArea);
    }
}
