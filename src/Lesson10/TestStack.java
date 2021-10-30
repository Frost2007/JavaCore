package Lesson10;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        //place numbers on the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        //pop these numbers from the stack
        System.out.println("Contents of the stack mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop()+" ");
        System.out.println();

        System.out.println("Contents of the stack mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.pop()+" ");


    }
}
