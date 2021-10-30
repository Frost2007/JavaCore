package Lesson8;

public class Rectangle {
    public static void main(String[] args) {
        int y = 1;
        while (y <= 5) {
            int x= 1;
            while (x <= 10) {
                if (y == 1 || y == 5) {
                    System.out.print("* ");
                } else if (x == 1 || x == 10) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                x++;
            }
            System.out.println();
            y++;
        }
    }
}


