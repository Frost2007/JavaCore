package Homework.FigurePainter;

public class FigurePainter3 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > i; j--)
                System.out.print("  ");


                for (int k = 0; k < i; k++) {
                    System.out.print(" *");

                }


            System.out.println();

        }

    }
}




