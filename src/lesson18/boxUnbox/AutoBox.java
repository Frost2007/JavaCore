package lesson18.boxUnbox;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;//autoboxing int i
        int i = iOb;// auto-unpacking int i
        System.out.println(i + " " + iOb);
    }
}
