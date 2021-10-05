package Lesson4;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[6][4];
        int a, b, x = 0;
        for (a = 0; a < 6; a++)
            for (b = 0; b < 4; b++) {
                twoD[a][b] = x;
                x++;}
                for (a = 0; a < 6; a++) {
                    for (b = 0; b < 4; b++)
                        System.out.print(twoD[a][b] + " ");
                    System.out.println();
                }

            }

    }



