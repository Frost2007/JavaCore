package lesson18.boxUnbox;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Исходное значение iOb1: " + iOb);

        ++iOb;
        System.out.println("Пocлe ++iOb1: " + iOb);
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 Пocлe выражения: " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i Пocлe выражения: " + i);
    }
}
