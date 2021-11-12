package RepeatHomeworks;

public class PracticeTest {
    public static void main(String[] args) {
PracticeHomework practiceHomework=new PracticeHomework();
        System.out.println(practiceHomework.convert(15));
        System.out.println(practiceHomework.calcAge(20));
        System.out.println(practiceHomework.nextNumber(115));
        System.out.println(practiceHomework.isSameNum(15, 89));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-3));
        System.out.println(practiceHomework.reverseBool(true));
        int[]num1={4,8,7,9,5,6,8,5,4,1};
        int[]num2={4,7,8,4,7,7,7};
        System.out.println(practiceHomework.maxLength(num1, num2));
    }
}
