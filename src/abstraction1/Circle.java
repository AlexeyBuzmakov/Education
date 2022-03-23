package abstraction1;

class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeterFigure() {
        return Math.PI * radius * 2;
    }
}
