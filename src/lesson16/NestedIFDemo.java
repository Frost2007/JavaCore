package lesson16;

import lesson16.interfaceDemo.A;
import lesson16.interfaceDemo.B;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println(" 10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("tis message will not output ");
    }
}
