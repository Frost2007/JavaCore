package lesson16;

import lesson16.interfaceDemo.Callback;
import lesson16.interfaceDemo.Client;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
