package lesson18.enumDemo;

public class EnumDemo3 {
    public static void main(String[] args) {

        Apple ap;
        System.out.println("Price of apple WINESAP: "+ Apple.WINESAP.getPrice()+" cents");
        System.out.println("Prices for all varieties of apples:");
        for (Apple a : Apple.values()) {
            System.out.println(a+" costs " + a.getPrice() + " cents");

        }
    }
}
