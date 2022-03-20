package Task1;


class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double squareDiagonal() {
        return Math.sqrt(2 * (side * side));
    }

    @Override
    public double areaFigure() {
        return side * side;
    }

    @Override
    public double perimetrFigure() {
        return side * 4;
    }

}
