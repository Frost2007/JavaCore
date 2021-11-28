package Lesson15.package1;


public class Dispatch {
    public static void main(String[] args) {
        A a = new A();// ob of class A
        B b = new B();// ob of class B
        C c = new C();//ob of class C
        A r;// получить ссылку на объект типа А
        r = a;
        a.callme();
        r = b;
        b.callme();
        r = c;
        c.callme();

    }

}
