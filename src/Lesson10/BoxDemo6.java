package Lesson10;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1= new Box(10,10,10);
        Box myBox2= new Box(5,15,10);
        double vol;
        // Count the Volume of Box1
        vol=myBox1.volume();
        System.out.println("Volume equals "+vol);
        // Count the Volume of Box2
        vol=myBox2.volume();
        System.out.println("Volume equals "+vol);
    }
}
