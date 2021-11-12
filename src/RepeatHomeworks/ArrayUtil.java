package RepeatHomeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {12, 4, 8, 9, 6, 77, 23, 14, 62, 104};
        System.out.println("Numbers in array are ");
        for (int i : array)

            System.out.print(i + ",");

        System.out.println();
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println(max + " is maximum value of array");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min + " is minimum value of array");
        int countOfEven = 0, countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
                countOfEven++;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
                countOfOdd++;
            }
        }
        System.out.println();
        System.out.println("Count of evens is " + countOfEven);
        System.out.println("count of odds is " + countOfOdd);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("The sum is " + sum);
        System.out.println("avg is " + sum / array.length);
    }
}

