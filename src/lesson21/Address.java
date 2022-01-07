package lesson21;

import java.util.*;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;

    }

    public String toString() {
        return name + "\n" + street + "\n" + city + "\n" + state
                + " " + " " + code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();
        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "Il", "61853"));
        ml.add(new Address("Tom Carlton", "Elm str",
                "Champaign", "Il", "61820"));

        for (Address element : ml) {
            System.out.println(element + "\n");

        }
        System.out.println();
    }
}
