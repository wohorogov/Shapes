package shapes;

public class Square extends Rectangle{
    private double side;
    private static final String type = "Квадрат";
    Square(double side) {
        super(type);
        this.side = side;
    }

    @Override
    public double getArea() {
        return getMultiplication(side, side);
    }
}
