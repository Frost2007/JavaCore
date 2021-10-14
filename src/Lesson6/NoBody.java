package Lesson6;

public class NoBody {
    public static void main(String[] args) {
        int i = 100,j = 200;
        while (++i < --j);
            System.out.println("The median value is " + i);
    }
}
