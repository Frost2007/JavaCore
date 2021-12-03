package lesson16.defaultImpl;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "object of String type";
    }

}
