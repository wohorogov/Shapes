package shapes;

public class Ellipse extends Shape{
    private double bigAxis;
    private double littleAxis;
    private static final String type = "Эллипс";
    Ellipse(double bigAxis, double littleAxis) {
        super(type);
        this.bigAxis = bigAxis;
        this.littleAxis = littleAxis;
    }

    Ellipse(String type) {
        super(type);
    }

    @Override
    public double getArea() {
        return bigAxis * littleAxis * Math.PI;
    }
}
