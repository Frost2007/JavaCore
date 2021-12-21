package lesson18.enumDemo;

public enum Apple {
    JONATHAN(10), GOLDEN_DEL(9), RED_DEL, WINESAP(15), CORTLAND(8);
    private int price;

    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
