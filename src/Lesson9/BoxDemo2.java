package Lesson9;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("Volume of mybox1 is " + vol);


        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Volume of mybox2 is " + vol);
    }
}
