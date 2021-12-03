package lesson16.interfaceDemo;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of method callback()");
        System.out.println("p in square is " + (p * p));
    }
}
