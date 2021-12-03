package lesson16.p2;

class OverPackage {
    OverPackage() {
        lesson16.p1.Protection p = new lesson16.p1.Protection();
        System.out.println("constructor from another package ");
        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);

        // доступно только для данного класса
        // System.out.println("n_pri =" + p.n_pri);

        // доступно только для данного класса,подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
