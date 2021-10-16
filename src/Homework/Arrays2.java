package Homework;

public class Arrays2 {
    public static void main(String[] args) {
        int num[] = {-14, -5, -26, -15, 177, -125, -44,-85, -63, -9};
      int min =num[0];
      for (int i = 0; i < num.length; i++) {
            if (num[i]<min)
                min=num[i];
        }
        System.out.println(min);
    }
}