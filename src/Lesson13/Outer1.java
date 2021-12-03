package Lesson13;

public class Outer1 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Output: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();

        }
    }
}
