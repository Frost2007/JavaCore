package Homework.BraceChecker;

public class Stack {
    private int[] array = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == array.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return array[size--];
        }
    }
}
