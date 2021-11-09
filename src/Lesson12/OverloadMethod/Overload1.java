package Lesson12.OverloadMethod;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 object=new OverloadDemo1();
        int i =88;
        object.test();
        object.test(10,20);
        object.test(i);//здесь вызывается вариант метода test(douЬle)
        object.test(123.2);//И здесь вызывается вариант метода test(douЬle)
    }
}
