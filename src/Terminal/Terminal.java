package Terminal;

import java.util.Scanner;
//Банковский перевод #Java #Pascal #php #JavaScript
//Банк берет комиссию за перевод по принципу - с каждой сотни рублей изымается комиссия - 7 рублей. За неполную сотню также изымается 7 рублей. К примеру, за перевод одного рубля придется выложить 1 + 7 = 8 рублей.
//За перевод 101 рубля придется выложить уже 100 + 7 + 1 + 7 = 115 рублей
//
//Пользователь вводит сумму, которую хочет перевести, а программа должна определить:
//1. Максимально возможную сумму перевода (с учетом, что комиссия за перевод будет браться из переводимой суммы).
//2. Комиссию за данный перевод.
//Тест 1.
//        Сумма к переводу: 10 рублей
//        Ответ
//        Максимальная сумма: 3 рубля
//        Комиссия: 7 рублей
//
//        Тест 2.
//        Сумма к переводу: 108 рублей
//        Ответ
//        Максимальная сумма: 100 рублей
//        Комиссия: 7 рублей
//

public class Terminal {
    public static void main(String[] args) {
        int commission2=0;
        int commission1=0;
        int cash;
        int pay1=0;
        int less=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Cash Please");
        cash = scanner.nextInt();
        if (cash >= 100) {
            commission1 = (cash / 100) * 7;
            pay1 = cash - commission1;
            less = cash % 100;
        }
        if (less < 100 && less > 0) {
            commission2 = 7;
        }
        if (cash < 8) {
            System.out.println("Transaction Impossible");
        }
        pay1 = cash - commission1 - commission2;
        System.out.println("Your Entered Cash =" + cash);
        System.out.println("Your Pay =" + pay1);
        System.out.println("Commission =" + (commission1 + commission2));

    }

}
