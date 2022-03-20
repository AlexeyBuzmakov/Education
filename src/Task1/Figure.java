package Task1;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double areaFigure();

    public abstract double perimetrFigure();
}
