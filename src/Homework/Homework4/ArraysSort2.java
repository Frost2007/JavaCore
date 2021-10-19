package Homework.Homework4;

public class ArraysSort2 {
    public static void main(String[] args) {
        int num[] = {14, 5, 26, 15, 177, 125, 44, 85, 63, 9};
        int x;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1 ; j++) {
                if(num[j]>num[j+1]){
                    x=num[j];
                    num[j]=num[j+1];
                    num[j+1]=x;
                }

            }

        }for(int a:num ) System.out.print(a+",");

    }
}