package Lesson12;

public class Stack1 {
    private int stack[] = new int[10];
    private int size;

    Stack1() {
        size = -1;
    }

    void push(int value) {
        if (size == stack.length)
            System.out.println("Stack is full");
        else stack[++size] = value;
    }

    int pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stack[size--];
    }
}
