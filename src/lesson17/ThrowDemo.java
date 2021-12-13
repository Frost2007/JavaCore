package lesson17;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("Exclusion intercepted in the body of method demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Repeated interception:");
        }
    }
}
