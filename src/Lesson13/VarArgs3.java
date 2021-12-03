package Lesson13;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...): "
                + "numbers of arguments: "
                + v.length + " content");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean...v) "
                + " numbers of arguments: "
                + v.length + "content");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();

    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ... ) : "
                + msg + v.length + "content: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Examination: ", 10, 20);
        vaTest(true, false, false);
    }
}
