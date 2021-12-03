package RepeatHomeworks;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int year) {
        return year * 365;
    }

    int nextNumber(int a) {
        return a + 1;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThanOrEqualToZero(int a) {
        return a <= 0;
    }

    boolean reverseBool(boolean value) {

        return !value;
    }

    int maxLength(int[] array1, int[] array2) {

        return array1.length > array2.length ? array1.length : array2.length;
    }
}

