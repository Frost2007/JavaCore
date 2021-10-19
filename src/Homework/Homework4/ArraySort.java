package Homework.Homework4;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {7, 4, 8, 2, 6, 37, 88, 12, 5};
        int x;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;

                }
            }
        }
        for (int a : array) {
            System.out.print(a + ",");

        }
    }
}

