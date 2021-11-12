package Homework.BraceChecker;

public class Stack {
    private int[] array = new int[10];
    private int size;
    void setSize(){

    }
    int getSize(){
        for (int i = 0; i <=size ; i++) {

        }
     return size;
    }

    public Stack() {
        size = -1;
    }
public Stack(int length){
        array=new int[length];
        size=-1;
}


    public void push(int value) {
        if (size == array.length) {
            System.out.println("stack is full");
        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
System.out.println("stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

}
