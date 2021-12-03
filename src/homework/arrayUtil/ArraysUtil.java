package homework.arrayUtil;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] array = {3, 6, 22, 14, 88, 65, 33, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println();
        System.out.println(max+" is maximum value");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min +" is minimum value");
        System.out.println("print only evens------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println("print only odds--------------------");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("print evens count------------------");
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEven++;
            }

        }
        System.out.println("count of even= " + countOfEven);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("sum:= " + sum);
        System.out.println("avg:=" + sum / array.length);

    }
}
