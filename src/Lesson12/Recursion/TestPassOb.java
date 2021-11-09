package Lesson12.Recursion;

import Lesson12.Recursion.Test;

public class TestPassOb {
    public static void main(String[] args) {
        Test ob1=new Test(100,22);
        Test ob2=new Test(100,22);
        Test ob3=new Test(-1,-1);

        System.out.println("ob1 == ob2: "+ob1.equals(ob2));
        System.out.println("ob1 == ob3: "+ob1.equals(ob3));

    }
}
