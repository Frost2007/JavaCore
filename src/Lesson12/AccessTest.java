package Lesson12;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        //ob.c=100 error
        ob.setC(100);// is true
        System.out.println("a b & c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
