package lesson21;

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.println("Original content of array vals : ");
        for (Integer val : vals) {
            System.out.print(val + " ");
        }
        System.out.println();
        int sum = 0;
        for (int val : vals)
            sum += val;
        System.out.println("The sum of numerical values: " + sum);
    }


}
