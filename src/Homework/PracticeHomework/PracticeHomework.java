package Homework.PracticeHomework;

public class PracticeHomework {

    long convert(int minutes) {
        long seconds = minutes * 60;
        return seconds;
    }

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    int nextNumber(int number) {
        int theNext = number + 1;
        return theNext;
    }

    boolean same;

    boolean isSame(int a, int b) {
        if (a == b) {
            same = true;
        } else same = false;
        return same;
    }

    boolean b;

    boolean lessThanOrEqualToZero(int a) {
        if (a <= 0) {
            b = true;
        } else b = false;
        return b;
    }

    boolean reverseBool(boolean value) {

        if (value == true) {
            value = false;
        } else if (value == false)
            value = true;
        return value;
    }

    int[] array1 = {};
    int[] array2 = {};
    int length;

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            length = array1.length;
            System.out.println("numbers1 length is more than numbers2 length, and it equals ");
        } else if (array2.length > array1.length)
            length = array2.length;
        System.out.println("numbers2 length is more than numbers1 length, and it equals ");

        return length;
    }

}
