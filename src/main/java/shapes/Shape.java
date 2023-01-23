package shapes;

import java.util.Random;

public abstract class Shape {
    private static int inc = 1;
    private int id;
    private Color color;
    private String typeShape;
    Shape(String typeShape) {
        this.id = inc++;
        this.color = Color.values()[new Random().nextInt(Color.values().length)];
        this.typeShape = typeShape;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract double getArea();
    public double getMultiplication(double first, double second) {
        return first * second;
    }

    public double getId() {
        return id;
    }

    public String getTypeName() {
        return typeShape;
    }
}
