import java.util.Scanner;

public class ConverterTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Converter conv = new Converter();
        System.out.println("Enter number please");
        double a = scanner.nextDouble();
        System.out.println("Please insert a value witch u want to convert");
        System.out.println(" km, mile, liter, gall, kg, OR pnd");

        boolean invalid;
        do {
            invalid = false;
            String c = scanner.next();
            switch (c) {

                case "km":
                    System.out.println(a + " KM= " + conv.convertMileLength(a) + " Ml");
                    break;
                case "mile":
                    System.out.println(a + " Ml= " + conv.convertKilometerLength(a) + " KM");
                    break;
                case "kg":
                    System.out.println(a + " KG= " + conv.convertPoundWeight(a) + " Pnd");
                    break;
                case "pnd":
                    System.out.println(a + " Pnd= " + conv.convertKgWeight(a) + " KG");
                    break;
                case "gall":
                    System.out.println(a + " Gal= " + conv.convertLitersVol(a) + " Lt");
                    break;
                case "liter":
                    System.out.println(a + " Lt= " + conv.convertGallonVol(a) + " Gal");
                    break;
                default:
                    invalid = true;
                    System.out.println("INVALID OPERATION ");
                    System.out.println("insert km, mile, liter, gall, kg, OR pnd");

            }

        } while (invalid);

    }

}
