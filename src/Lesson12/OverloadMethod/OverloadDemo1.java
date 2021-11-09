package Lesson12.OverloadMethod;

public class OverloadDemo1 {
    void test(){
        System.out.println("parameters except");
    }
    void  test(int a,int b){
        System.out.println("a & b: "+a+" "+b);
    }
    void  test (double a){
        System.out.println("Internal call conversion"+" test(double) a: "+a);
    }

}
