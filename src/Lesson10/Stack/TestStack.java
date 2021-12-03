package Lesson10.Stack;

import Lesson10.Stack.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(10);
        Stack myStack2 = new Stack(20);
        //place numbers on the stack
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);
        //pop these numbers from the stack
        System.out.println("Contents of the stack myStack1:");
        for (int i = 0; i < 10; i++)
            System.out.print(myStack1.pop()+" ");
        System.out.println();

        System.out.println("Contents of the stack myStack2:");
        for (int i = 0; i < 10; i++)
            System.out.print(myStack2.pop()+" ");


    }
}
