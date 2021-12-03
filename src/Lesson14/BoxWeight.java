package Lesson14;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob); //вызвать конструктор суперкласса
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
