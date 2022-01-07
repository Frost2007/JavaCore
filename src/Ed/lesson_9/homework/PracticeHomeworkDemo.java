package Ed.lesson_9.homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework functions = new PracticeHomework();
        System.out.println(functions.convert(10));
        System.out.println(functions.calcAge(20));
        System.out.println(functions.isSameNum(10, 10));
        System.out.println(functions.lessOrEqualToZero(-20));
        System.out.println(functions.nextNumber(50));
        System.out.println(functions.reverseBool(false));
        int[] array1 = {1, 2, 4};
        int[] array2 = {4, 5, 7, 8, 9};
        System.out.println(functions.maxLength(array1,array2));

    }
}
