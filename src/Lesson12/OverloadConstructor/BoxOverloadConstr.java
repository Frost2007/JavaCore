package Lesson12.OverloadConstructor;

import Lesson12.OverloadConstructor.BoxConstructor;

public class BoxOverloadConstr {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные конструкторы
        BoxConstructor mybox1 = new BoxConstructor(10, 20, 15);
        BoxConstructor mybox2 = new BoxConstructor();
        BoxConstructor mycube = new BoxConstructor(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 volume is " + vol);
        vol=mybox2.volume();
        System.out.println("mybox2 volume is "+vol);
        vol=mycube.volume();
        System.out.println("mycube volume is "+vol);

    }
}
