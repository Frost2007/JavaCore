package Lesson14;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B(12,20);
        // Սուպերկլասսը կարող է օգտագոծվել ինքնուրույն:
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content of object superOb: ");
        superOb.showij();
        System.out.println();
        //ենթակլասսը իր սուպերկլսսի բոլոր բց անդամներին ունի հասանելիություն:
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("The sum of i , j & k in object subOb:");
        subOb.sum();
    }
}
