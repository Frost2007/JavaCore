package lesson18.enumDemo;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Constants of enum Apple");

        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("WINESAP");
        System.out.println("Variable ap contains WINESAP");


    }
}
