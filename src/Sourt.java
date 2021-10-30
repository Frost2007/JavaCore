public class Sourt {
    public static void main(String[] args) {
        int a[] = {9, 47, 489, 578, 12, 45, 75, -14, -5, -200, 6, 1, 7, 4, 5};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        for (int i : a) {
            System.out.print(i + " ");

        }

    }
}
