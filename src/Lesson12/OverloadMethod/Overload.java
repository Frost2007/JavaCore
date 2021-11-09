package Lesson12.OverloadMethod;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo object = new OverloadDemo();
        double result;
        //вызвать все варианты метода test()
        object.test();
        object.test(10);
        object.test(10, 20);
        result = object.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
