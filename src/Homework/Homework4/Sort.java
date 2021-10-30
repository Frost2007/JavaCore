package Homework.Homework4;

public class Sort {
    public static void main(String[] args) {
        int[] num = {5, 4, 7, 9, 1, 3, 2, 6, 8};
        int x;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] < num[j + 1]) {
                    x=num[j+1];
                    num[j + 1] = num[j];
                    num[j]=x;


                }

            }

        }
        for (int a:num)
        System.out.print(a+",");


    }
}
