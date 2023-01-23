package shapes;

public class Rectangle extends Parallelogram implements CloneableShape{
    private double side1;
    private double side2;
    private static final String type = "Прямоугольник";
    Rectangle(double side1, double side2) {
        super(type);
        this.side1 = side1;
        this.side2 = side2;
    }

    Rectangle(String type) {
        super(type);
    }

    @Override
    public double getArea() {
        return getMultiplication(side1, side2);
    }

    @Override
    public Object clone(double scale) {
        return new Rectangle(this.side1 * scale, this.side2 * scale);
    }
}
