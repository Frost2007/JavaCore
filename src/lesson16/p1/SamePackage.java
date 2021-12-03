package lesson16.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("constructor from same package");
        System.out.println("n = " + p.n);
        //доступно только для класса
        // System.out.println("n_pri"+ p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);


    }
}
