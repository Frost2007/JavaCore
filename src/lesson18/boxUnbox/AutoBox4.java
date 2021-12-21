package lesson18.boxUnbox;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iob = 100;
        Double dob = 98.6;
        dob = dob + iob;
        System.out.println("dOb Пocлe выражения: " + dob);
        Integer iob1=2;
        switch (iob1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("Error");
        }
    }
}
