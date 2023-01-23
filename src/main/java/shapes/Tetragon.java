package shapes;

public class Tetragon extends Shape{
    private static final String type = "Четырехугольник";
    private double diagonal1;
    private double diagonal2;
    private double cornerBetweenDiagonals;

    Tetragon(double diagonal1, double diagonal2, double cornerBetweenDiagonals) {
        super(type);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.cornerBetweenDiagonals = cornerBetweenDiagonals;
    }

    Tetragon(String type) {
        super(type);
    }

    @Override
    public double getArea() {
        return getMultiplication(diagonal1, diagonal2) * Math.sin(cornerBetweenDiagonals) / 2;
    }
}
