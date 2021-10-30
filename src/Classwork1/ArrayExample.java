package Classwork1;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {7, 5, 4, 2, 8, 2, 6, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "- կրկնվող թիվ է ");
                    break;
                }
            }
        }
        boolean isEven = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 !=0) {
                isEven = false;
                System.out.println(isEven);
                break;
            }
        }
    }
}
