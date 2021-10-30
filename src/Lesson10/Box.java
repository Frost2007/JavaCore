package Lesson10;

public class Box {
    double width;
    double height;
    double depth;

    //This is constructor of Box class
    Box(double w,double h, double d) {
        width = w;
        height =h ;
        depth = d;
    }

    //Count and return volume// method
    double volume() {
        return width * height * depth;
    }
}
