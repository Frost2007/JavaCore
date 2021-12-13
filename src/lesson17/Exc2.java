package lesson17;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("This string do not type");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After operator catch");
    }
}
