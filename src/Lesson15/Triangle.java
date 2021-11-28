package Lesson15;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the area of the triangle");
        return dim1 * dim2 / 2;
    }
}
