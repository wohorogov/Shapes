package shapes;

public class EquilateralTriangle extends Triangle implements CloneableShape{
    double side;
    private static final String type = "Равносторонний треугольник";
    EquilateralTriangle(double side) {
        super(type);
        this.side = side;
    }

    @Override
    public double getArea() {
        return getMultiplication(Math.sqrt(3), Math.pow(side, 2)) / 4;
    }

    @Override
    public Object clone(double scale) {
        return new EquilateralTriangle(side * scale);
    }
}
