package lesson18.enumDemo;

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap;
        ap = Apple.RED_DEL;
        System.out.println("value ap: " + ap);

        ap = Apple.GOLDEN_DEL;
        if (ap == Apple.GOLDEN_DEL) {
            System.out.println("Variable ap contains GOLDEN_DELL.\n");

            switch (ap){
                case JONATHAN:
                    System.out.println("JONATHAN is red");
                    break;
                case GOLDEN_DEL:
                    System.out.println("GOLDEN_DEL is yellow");
                    break;
                case RED_DEL:
                    System.out.println("RED_DEL is red");
                    break;
                case WINESAP:
                    System.out.println("WINESAP is red");
                    break;
                case CORTLAND:
                    System.out.println("CORTLAND is red");
                    break;
            }
        }

    }
}
