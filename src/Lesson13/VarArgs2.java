package Lesson13;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One variable length parameter:", 10);
        vaTest("three variables length parameter:", 1, 2, 3);
        vaTest("Without variables length parameter");
    }
}
