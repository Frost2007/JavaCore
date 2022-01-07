package Ed.lesson_9;

public class Box {
    double height;
    double width;
    double depth;

    double volume() {
        double vol = depth * height * width;
        return vol;
    }
}