package lesson21;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("John Dow", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Backer", 1378.00);
        hm.put("Tod Holle", 99.22);
        hm.put("Ralph Smith", -19.08);
        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //внести сумму 1000 на счет Джона Доу
        double balance = hm.get("John Dow");
        hm.put("John Dow", balance + 1000);
        System.out.println("John Dow`s account new balance is: "
                + hm.get("John Dow"));


    }
}
