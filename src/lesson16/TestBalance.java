package lesson16;

import lesson16.mypack.*;

class TestBalance {
    public static void main(String[] args) {
        // Класс Balance объявлен как public, поэтому им можно
        //воспользоваться и вызвать его конструктор.
        Balance test = new Balance("J. J. Jasper's",99.88);
        test.show();
    }
}
