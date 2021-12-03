package Lesson12;

public class TestStack1 {
    public static void main(String[] args) {
        Stack1 myStack1 = new Stack1();
        Stack1 myStack2 = new Stack1();

        //push items in the stacks
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);
        // pop items o teh stacks
        System.out.println(" myStack1 :");
        for (int i = 0; i < 10; i++) System.out.println(myStack1.pop());

        System.out.println(" myStack2 :");
        for (int i = 0; i < 10; i++) System.out.println(myStack2.pop());

        //myStack1.size= -2
        //myStack2.stack[6]=100; unacceptable
    }
}
