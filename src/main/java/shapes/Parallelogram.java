package shapes;

public class Parallelogram extends Tetragon{
    private double side1;
    private double side2;
    private double cornerBetweenSides;
    private static final String type = "Параллелограм";
    Parallelogram(double side1, double side2, double cornerBetweenSides) {
        super(type);
        this.side1 = side1;
        this.side2 = side2;
        this.cornerBetweenSides = cornerBetweenSides;
    }

    Parallelogram(String type) {
        super(type);
    }

    @Override
    public double getArea() {
        return getMultiplication(side1, side2) * Math.sin(cornerBetweenSides);
    }
}
