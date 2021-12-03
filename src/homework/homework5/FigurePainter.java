package homework.homework5;

public class FigurePainter {
    void figureOne(int n) {
        char c = '*';
        for (int i = 0; i <= n; i++) {
            for (int j = -1; j < i - 1; j++) {
                System.out.print(" " + c);

            }
            System.out.println();
        }
    }

    void figureTwo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    void figureThree(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("  ");

            for (int k = 0; k < i; k++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }

    void figureFour(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 4; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print(" *");
            System.out.println();
        }

        for (int l = 1; l < 4; l++) {
            for (int j = 0; j < l; j++)
                System.out.print(" ");
            for (int m = 4; m > l; m--)
                System.out.print(" *");
            System.out.println();
        }

    }

    void figureFive(int m) {
        for (int i = 1; i < m; i++) {
            {
                for (int n = 1; n < i; n++)
                    System.out.print("  ");
                {
                    for (int j = 5; j > i; j--)
                        System.out.print(" *");


                }
                System.out.println();
            }
        }
    }
}
