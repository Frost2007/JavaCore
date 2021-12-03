package lesson16.defaultImpl;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImpl obj = new MyIFImpl();
        MyIFImpl2 obj2 = new MyIFImpl2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
