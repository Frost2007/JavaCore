package Lesson13;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;

        System.out.println("The length of strOb1: " + strOb1.length());
        System.out.println("Symbol by index 3 in line strOb1: " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println();
        else
            System.out.println("strOb1 != strOb2");
        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
