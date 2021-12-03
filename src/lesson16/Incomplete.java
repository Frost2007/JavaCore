package lesson16;

import lesson16.interfaceDemo.Callback;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
