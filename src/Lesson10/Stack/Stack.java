package Lesson10.Stack;

public class Stack {
    private int stack[];
    private int index;

    Stack( int size) {
        stack = new int[size];
        index = -1;
    }

    // Insert an element in the Stack.
    void push(int item) {
        if (index == stack.length - 1)
            System.out.println("Stack is full");
        else
            stack[++index] = item;
    }

    // Eject an element from the Stack.
    int pop() {
        if (index < 0) {
            System.out.println("The Stack is empty");
            return 0;
        } else
            return stack[index--];
    }
}
