package polymorphism5;

class Rectangle extends Figure {
    private int sideRectangle1;
    private int sideRectangle2;

    public Rectangle(int side1, int side2) {
        this.sideRectangle1 = side1;
        this.sideRectangle2 = side2;
    }

    @Override
    public double calculateArea() {
        return sideRectangle1 * sideRectangle2;
    }
}
