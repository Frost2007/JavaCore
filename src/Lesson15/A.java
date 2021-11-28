package Lesson15;

public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }
    A(){

    }

    void show() {
        System.out.println(" i & j :" + i + " " + j);
    }
    void callme(){
        System.out.println("in method callme() from class A");
    }
}
