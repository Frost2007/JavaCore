package RepeatHomeworks;

public class FigurePainter {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + c);

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print(" *");
            System.out.println();
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = 4; k > i; k--)
                System.out.print(" *");
            System.out.println();
        }

    }
}
