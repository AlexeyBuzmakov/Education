package polimorphism.polymorphism5;

public class Calculator {


    public double calculateAreaFigure(Figure[] figures) {
        double area = 0;
        for(Figure figure : figures) {
            area += figure.calculateArea();
        }
        return area;
    }
}
