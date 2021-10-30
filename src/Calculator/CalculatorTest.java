package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println("Գումարը հավասար է "+myCalc.gumarum(5, 6));
        System.out.println("Տարբերությունը հավասար է "+myCalc.hanum(6, 5));
        System.out.println("Քանորդը հավասար է "+myCalc.bajanum(15, 4));
        System.out.println("Արտադրյալը հավասար է "+myCalc.bazmapatkum(15, 80));


    }
}
