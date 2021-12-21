package lesson18.enumDemo;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        //получить все порядковые значения с помощью метода ordinal()
        System.out.println("All constants of Apple varieties" +
                " and their ordinals");
        for (Apple a : Apple.values()) {
            System.out.println(a + "" + a.ordinal());
        }
        ap = Apple.RED_DEL;
        ap2 = Apple.GOLDEN_DEL;
        ap3 = Apple.RED_DEL;

        System.out.println();
        //methods compareTo() & equals()
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " preceded by " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " preceded by " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();
        if (ap.equals(ap2))
            System.err.println("Error");
        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);


    }
}
