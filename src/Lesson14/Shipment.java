package Lesson14;

public class Shipment extends BoxWeight {
    double cost;

    // construct the clone of object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // constructor use all parameters
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor create cube
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
