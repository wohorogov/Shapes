package shapes;

public class RightTriangle extends Triangle{
    private static final String type = "Прямоугольный треугольник";
    private double leg1;
    private double leg2;
    private double hypotenuse;

    RightTriangle(double leg1, double leg2) {
        super(type);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(leg1*leg1 + leg2*leg2);
    }

    @Override
    public double getArea() {
        return 0.5 * getMultiplication(leg1, leg2);
    }
}
