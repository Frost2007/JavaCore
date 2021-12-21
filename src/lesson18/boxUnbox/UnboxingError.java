package lesson18.boxUnbox;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iob =1000;
        int i = iob.byteValue();
        System.out.println(i);
    }
}
