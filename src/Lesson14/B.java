package Lesson14;

 class B extends A {
    B(){
        System.out.println("In constructor B.");
    }
    int k;
    int i;

    B(int a, int b) {
        super.i = a; // A class i
        i = b;       // B class i
    }
   void show(){
       System.out.println("i in superclass: " + super.i);
       System.out.println("i in subclass: " + i);
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
