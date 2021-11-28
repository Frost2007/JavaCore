package Lesson15;

public class B extends A {
    int k;

    B() {

    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println(" k :" + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }

    void callme() {
        System.out.println("in method callme() from class B");

    }
}
