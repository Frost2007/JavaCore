package lesson17;

public class MethNestTry {
    static void nesttry(int a) {
        try {/*Если указан один аргумент командной строки,
               то исключение в связи с делением на нуль
               будет сгенерировано в следующем коде.*/
            if (a == 1) a = a / (a - a);
            /* Если указаны два аргумента командной строки,
               то генерируется исключение в связи с выходом
               за пределы массива. */
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is out of bounds " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            System.out.println("a= " + a);
            nesttry(a);
        }catch (ArithmeticException e){
            System.out.println("Division by zero"+ e);
        }
    }
}
