package Lesson14;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {                    // create clone of object
        //pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) { //3 parameters
        width = w;
        height = h;
        depth = d;
    }

    Box() {                           // none parameters
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {                 // create cube
        width = height = depth = len;
    }

    double volume() {                //calculate and return volume
        return width * height * depth;
    }
}
