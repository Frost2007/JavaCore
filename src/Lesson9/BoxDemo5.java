package Lesson9;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        double vol;
        box1.setDim(10, 20, 15);
        box2.setDim(6, 3, 9);
        System.out.println("The volume of box1 is " + box1.volume());
        System.out.println("The volume of box2 is " + box2.volume());
    }
}
