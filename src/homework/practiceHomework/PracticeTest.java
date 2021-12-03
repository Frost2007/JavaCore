package homework.practiceHomework;

public class PracticeTest {
    public static void main(String[] args) {
        PracticeHomework myConvert = new PracticeHomework();


        System.out.println(myConvert.convert(50) + " seconds");
        System.out.println(myConvert.calcAge(2) + " days");
        System.out.println(myConvert.nextNumber(45) + " is the next");
        System.out.println(myConvert.isSame(5, 5));
        System.out.println(myConvert.lessThanOrEqualToZero(-5));
        System.out.println(myConvert.reverseBool(false));
        int[] numbers1 = {1, 2, 3, 4, 5, 8, 9, 10};
        int[] numbers2 = {1, 45, 37, 4, 58, 6, 87, 8, 9, 1, 4, 5, 8};
        System.out.print(myConvert.maxLength(numbers1, numbers2));


    }
}
