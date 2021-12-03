package Lesson11;

import calculator.Calculator;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1");
        int number1 = scanner.nextInt();
        System.out.println("Insert number2");
        int number2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        ifInvalid:
        for (int i = 0; i < i + 1; i++) {
            System.out.println("insert operation + - * or / ");
            String operation = scanner.next();
            switch (operation) {
                case "+":
                    System.out.println(calculator.gumarum(number1, number2));
                    break ifInvalid;
                case "-":
                    System.out.println(calculator.hanum(number1, number2));
                    break ifInvalid;
                case "*":
                    System.out.println(calculator.bazmapatkum(number1, number2));
                    break ifInvalid;
                case "/":
                    System.out.println(calculator.bajanum(number1, number2));
                    break ifInvalid;
                default:
                    System.out.println("Invalid operation");
                    continue ifInvalid;
            }
        }
    }
}

