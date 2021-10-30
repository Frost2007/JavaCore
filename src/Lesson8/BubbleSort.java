package Lesson8;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 3, 1, 6, 93, 44, 22, 11};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }

        }
        for (int j : array) {
            System.out.print(j+" ,");

        }

    }
}
