package shapes;

public class IsoscelesTriangle extends Triangle{

    private double hip;
    private double side;
    private static final String type = "Равнобедренный треугольник";
    private double cornerBetweenHips;
    IsoscelesTriangle(double hip, double cornerBetweenHips) {
        super(type);
        this.hip = hip;
        this.side = Math.sqrt(hip*hip + hip*hip - 2*hip*hip*Math.cos(cornerBetweenHips));
    }

    @Override
    public double getArea() {
        return 0.5 * getMultiplication(Math.pow(hip, 2), Math.sin(cornerBetweenHips));
    }

}
