package Homework;

public class minimalExample {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 15, 8, 6, 77};

        int min = numbers[0];
        int minIndex = 0;
        for (int x = 1; x < numbers.length; x++) {
            if (min > numbers[x]) {
                min = numbers[x];
                minIndex = x;
            }
        }
        System.out.println(min);
    }
}