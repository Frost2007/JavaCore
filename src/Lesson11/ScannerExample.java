package Lesson11;

import Calculator.Calculator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();
        Calculator myCalculator = new Calculator();

        boolean isWrong;
        do {
            isWrong = false;
            System.out.println("please input operation(+ ,- ,* ,or /)");
            String c = scanner.next();
            switch (c) {
                case "+":
                    System.out.println(myCalculator.gumarum(a, b));
                    break;
                case "-":
                    System.out.println(myCalculator.hanum(a, b));
                    break;
                case "*":
                    System.out.println(myCalculator.bazmapatkum(a, b));
                    break;
                case "/":
                    System.out.println(myCalculator.bajanum(a, b));
                    break;
                default:
                    isWrong = true;
                    System.out.println("Invalid operation");
            }

        } while (isWrong);
    }
}

