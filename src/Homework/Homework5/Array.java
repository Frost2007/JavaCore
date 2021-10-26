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

    int countOfEvens(int number[]) {
        int countOfEvens = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        return countOfEvens;
    }

    int countOfOdds(int number[]) {
        int countOfOdds = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        return countOfOdds;
    }

    int sum(int number[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        return sum;
    }

    double avg(int number[]) {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        avg = sum / number.length;
        return avg;
    }

    int max(int number[]) {
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    int min(int number[]) {
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }
}