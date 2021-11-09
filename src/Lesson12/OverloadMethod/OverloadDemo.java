package Lesson12.OverloadMethod;

public class OverloadDemo {
    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличиедвух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a  &  b: " + a + " " + b);
    }

    //Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a) {
        System.out.println(" double a: " + a);
        return a * a;
    }
}

