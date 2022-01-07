package Ed.lesson_9;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.depth = 12;
        myBox.height = 10;
        myBox.width = 10;
        System.out.println(myBox.volume());
    }
}
