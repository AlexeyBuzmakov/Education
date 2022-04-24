package generics.generics3.task6;

import generics.generics3.task6.figure.Circle;
import generics.generics3.task6.figure.Square;
import generics.generics3.task6.figure.Figure;

public class UtilsFigure {

    public void countFigure(Figure...figures) {
        for(Figure figure : figures) {
           if(figure instanceof Circle) {
               Circle.countCircle++;
           }
           else if(figure instanceof Square) {
               Square.countSquare++;
           }
        }
        System.out.println("Кругов: " + Circle.countCircle + " Квадратов: " + Square.countSquare);
    }
}
