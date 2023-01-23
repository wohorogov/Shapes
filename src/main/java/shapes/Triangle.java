package shapes;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    private static final String type = "Треугольник";


    Triangle(int side1, int side2, int side3) {
        super(type);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(String type) {
        super(type);
    }

    @Override
    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;

        return  Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}
