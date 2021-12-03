package lesson16;

import lesson16.interfaceDemo.AnotherClient;
import lesson16.interfaceDemo.Callback;
import lesson16.interfaceDemo.Client;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);

    }
}
