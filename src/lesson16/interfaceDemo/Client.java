package lesson16.interfaceDemo;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback method call with value "+ p);
    }
    void nonIfaceMeth() {
        System.out.println("In classes that implement interfaces other members may be defined.");
    }
}
