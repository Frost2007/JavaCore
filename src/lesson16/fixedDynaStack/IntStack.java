package lesson16.fixedDynaStack;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear(){
        System.out.println("The clear () method is not implemented.");
    }

}
