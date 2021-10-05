package Homework;

public class FigurePainter2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1; j--) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }


    }
}