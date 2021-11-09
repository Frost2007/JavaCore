package Lesson12.OverloadConstructor;

public class BoxConstructor {
    double width;
    double height;
    double depth;

    //конструктор, используемый, когда указываются все размеры
    BoxConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, когда ни один из размеров не указан
    BoxConstructor() {
        width = -1;  //использовать значение -1 для обозначения неинициализированного
        height = -1; // параллелепипеда
        depth = -1;
    }

    // конструктор, используемый при создании куба
    BoxConstructor(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
