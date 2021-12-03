package homework.figurePainter;

public class FigurePainter1 {
    public static void main(String[] args) {
        char c = '*';
        for (int i = 0; i <= 4; i++) {
            for (int j = -1; j < i - 1; j++) {
                System.out.print(" " + c);

            }
            System.out.println();
        }
    }
}
