package lesson16.fixedDynaSrack;

public class IFTest2 {
    public static void main(String[] args) {
        DynaStack mystack1 = new DynaStack(5);
        DynaStack mystack2 = new DynaStack(8);

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("STACK  in mystack1: ");
        for (int i = 0; i < 12; i++)
            System.out.print(mystack1.pop() + " ");
        System.out.println();
        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 20; i++)
            System.out.print(mystack2.pop() + " ");
    }

}
