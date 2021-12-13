package lesson17;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        Random r = new Random();
        for (int i = 0; i < 320; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e);
                a = 0;//присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
