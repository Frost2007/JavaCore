package Lesson12.OverloadConstructor;

//В этой версии класса Вох один объект допускается
// инициализировать другим объектом
public class Box {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор. В качестве
    //параметра в нем используется объект типа Вох
    Box(Box ob) {//передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый, когда
    //указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из
    //размеров не указан
    Box() {
        width = -1;        // использовать значение -1 для
        height = -1;      // обозначения неинициализированного параллелепипеда
        depth = -1;
    }

    //конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    //рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}
