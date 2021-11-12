package RepeatHomeworks;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 8, 4, 12, 6, 24, 44, 1, 18, 10};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }

        }
        for (int i : array) {
            System.out.print(i+",");

        }
    }
}
