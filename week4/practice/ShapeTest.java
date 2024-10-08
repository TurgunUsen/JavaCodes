import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        // Creating different shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(4);

        // Adding shapes to a list
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

        // Demonstrating polymorphism
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getShapeType());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }

        // Demonstrating drawable behavior
        Drawable drawableCircle = (Drawable) circle;
        Drawable drawableRectangle = (Drawable) rectangle;
        Drawable drawableSquare = (Drawable) square;
        drawableCircle.draw();
        drawableRectangle.draw();
        drawableSquare.draw();
    }
}
