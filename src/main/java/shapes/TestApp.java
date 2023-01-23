package shapes;

import java.util.ArrayList;

public class TestApp {
    public void start() {
        Shape[] shapes = {new Square( 2.2), new Ellipse( 23, 11), new Parallelogram( 10, 12, 40),
                          new Rectangle( 2, 3), new Circle(5), new Triangle(1, 2, 3), new Circle(10), new Square(14),
                          new EquilateralTriangle(34), new RightTriangle(12, 10), new Tetragon(10, 10, 40)};
        double area = 0;
        double newArea = 0;
        ArrayList<Shape> listShapes = new ArrayList<Shape>();
        for (Shape shape:
             shapes) {
            area += shape.getArea();
            listShapes.add(shape);

            if ( shape instanceof CloneableShape) {
                CloneableShape cloneShape = (CloneableShape) ((CloneableShape) shape).clone(2);
                listShapes.add((Shape) cloneShape);
                newArea += ((Shape) cloneShape).getArea();
            }
        }

        newArea += area;
        System.out.println("Общая площадь до клонирования - " + area + "; Общая площадь после клонирования - " + newArea);

        Counter counter = new Counter();
        int numColor;
        for (Shape shape:
                listShapes) {
            System.out.println("ИД - " + shape.getId() + "; площадь - " + shape.getArea() + "; цвет - " + shape.getColor().toString() + "; тип - " + shape.getTypeName());
            if (shape instanceof Ellipse) {
                counter.addRound();
            } else if (shape instanceof Triangle) {
                counter.addTriangular();
            } else if (shape instanceof Tetragon) {
                counter.addQuadrangular();
            }
            numColor = shape.getColor().ordinal();
            counter.addColor(numColor);
        }

        System.out.println("Всего:");
        System.out.println("Треугольников " + counter.getTriangular() + "; четырехугольников: " + counter.getQuadrangular() + "; круглых: " + counter.getRound());

        for (int i = 0; i < Color.values().length; i++) {
            System.out.println(Color.values()[i] + " " + counter.getCountColor(i));
        }

    }
}
