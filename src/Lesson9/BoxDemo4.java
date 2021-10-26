package Lesson9;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        System.out.println("Volume of box1 is "+box1.volume());
        System.out.println("Volume of box2 is "+box2.volume());
    }
}
