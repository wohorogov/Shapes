package shapes;

public class Circle extends Ellipse implements CloneableShape{
    private double radius;
    private static final String type = "Круг";
    Circle(double radius) {
        super(type);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Object clone(double scale) {
        return new Circle(this.radius * scale);
    }
}
