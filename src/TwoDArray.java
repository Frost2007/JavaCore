public class TwoDArray {
    public static void main(String[] args) {// ays orinaky chi stacvel

        int twoD[][] = new int[4][4];
        int i, j, k = 1;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++) {
                twoD[i][j] = k;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j <4; j++) System.out.println(twoD[i][j] + "");
            System.out.println();
        }

    }
}
