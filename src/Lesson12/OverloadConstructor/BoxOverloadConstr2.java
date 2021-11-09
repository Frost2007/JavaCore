package Lesson12.OverloadConstructor;

import Lesson12.OverloadConstructor.Box;

public class BoxOverloadConstr2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);            // создать копию объекта mybox1

        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);
        vol = mybox2.volume();
        System.out.println("volume of mybox2 is " + vol);
        vol = mycube.volume();
        System.out.println("volume of mycube is " + vol);
        vol = myclone.volume();
        System.out.println("volume of clone is " + vol);
    }

}
