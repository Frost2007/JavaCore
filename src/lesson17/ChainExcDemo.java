package lesson17;

public class ChainExcDemo {
    static void demoproc() {
        //создать исключение
        NullPointerException e = new NullPointerException("Top level");
        //добавить причину исключения
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            //вывести исключение верхнего уровня
            System.out.println("Exception expected"+ e);
            //вывести исключение, послужившее причиной для исключения верхнего уровня
            System.out.println("First reason" + e.getCause());
        }
    }
}
