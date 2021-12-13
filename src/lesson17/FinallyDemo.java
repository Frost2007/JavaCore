package lesson17;

public class FinallyDemo {
   // сгенерировать исключение в методе
    static void procA(){
        try {
            System.out.println("in body of method procA()");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("Finally statement block in procA () method");
        }
    }
    //возвратить управление из блока оператора try
    static void procB(){
        try {
            System.out.println("in body of method procB()");
        }finally {
            System.out.println("Finally statement block in procB () method");
        }
    }
    //выполнить блок try, как обычно
    static void procC(){
        try {
            System.out.println("in body of method procC()");
        }finally {
            System.out.println("Finally statement block in procC () method");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Exclusion intercepted");
        }
        procB();
        procC();

    }
}
