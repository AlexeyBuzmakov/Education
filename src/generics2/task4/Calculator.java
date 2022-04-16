package generics2.task4;

import generics2.task4.figure.Figure;

import java.util.ArrayList;

public class Calculator {

    public double figuresArea(ArrayList<Figure>list) {
        int sum = 0;
        for (Figure figure : list) {
            sum += figure.calculateArea();
        }
        return sum;
    }
}
