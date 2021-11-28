package Lesson15;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the area of the rectangle.");
        return dim1 * dim2;
    }
}
