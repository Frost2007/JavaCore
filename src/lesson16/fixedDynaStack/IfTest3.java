package lesson16.fixedDynaStack;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynaStack ds = new DynaStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;// load dynamic stack and push items
        for (int i = 0; i < 12; i++) mystack.push(i);
        mystack = fs; // load fixed stack and push
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;//load dynamic stack
        System.out.println("items in dynamic stack");
        for (int i = 0; i < 12; i++)
            System.out.print(mystack.pop() + " ");
        System.out.println();
        mystack = fs;// load fixed stack
        System.out.println("items in fixed stack");
        for (int i = 0; i < 8; i++)
            System.out.print(mystack.pop() + " ");
    }
}
