package Homework.Homework5;

public class Array {
    void array(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();
    }

    void evens(int number[]) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + ", ");
            }
        }
        System.out.println();

    }

    void odds(int number[]) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                System.out.print(number[i] + ", ");
            }

        }
        System.out.println();
    }

    int countOfEvens(int array[]) {
        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        return countOfEvens;
    }

    int countOfOdds(int array[]) {
        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        return countOfOdds;
    }

    int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    double avg(int array[]) {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        return avg;
    }

    int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}