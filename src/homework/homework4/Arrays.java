package homework.homework4;

public class Arrays {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 15, 8, 6, 77};
        int i;
        for ( i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        int count = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] % 2 == 0) {
                System.out.print(numbers[k] + ",");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        int sum = 0;
        for (int s = 0; s < numbers.length; s++) {
            sum += numbers[s];

        }
        System.out.println(sum);
        double middle = 0;
        for (int t = 0; t < numbers.length; t++) {
            middle += numbers[t];
        }
        System.out.println(middle / numbers.length);
        int min = numbers[0];
        int minIndex = 0;
        for (int x = 1; x < numbers.length; x++) {
            if (min > numbers[x])
            {
                min = numbers[x];
                minIndex = x;
            }


        }
        System.out.println(min);
    }
}
