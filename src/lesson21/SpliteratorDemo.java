package lesson21;

import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        System.out.println("Content of ArrayList vals: ");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) ->
                System.out.println(n))) ;
        System.out.println();
        //создать новый списочный массив,содержащий квадратные корни числовых
        // значений из списочного массива vals
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n)->sqrs.add(Math.sqrt(n))));
        // вызвать метод forEachRemaining()
        // для вывода содержимого списочного массива sqrs
        System.out.print("Content of ArrayList sqrs:\n");
        spliterator= sqrs.spliterator();
        spliterator.forEachRemaining((n)->System.out.println(n));
        System.out.println();


    }
}
