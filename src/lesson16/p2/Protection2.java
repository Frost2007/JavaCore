package lesson16.p2;

class Protection2 extends lesson16.p1.Protection {
    Protection2() {
        System.out.println("constructor inherited from another package");
        //доступно только для данного класса или пакета
        // System.out.println("n = " + n);
        // доступно только для данного класса или пакета
        // System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
