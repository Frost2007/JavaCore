package homework.figurePainter;

public class FigurePainter4 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++)
        {
            for (int j = 4; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print(" *");
            System.out.println();
        }

        for (int l = 1; l < 4; l++)
        {
            for (int n = 0; n < l; n++)
                System.out.print(" ");
            for (int m = 4; m > l; m--)
                System.out.print(" *");
            System.out.println();
        }


    }
}
