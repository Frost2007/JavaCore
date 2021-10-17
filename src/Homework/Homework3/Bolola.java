package Homework.Homework3;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (char x : bolola) {
            if (x == c) {
                count++;
            }
        }
        System.out.println("1.------------");
        System.out.println(" The count of char'o' = " + count);
        System.out.println("2.------------");
        System.out.println(bolola[bolola.length / 2 - 1] + "," + bolola[bolola.length / 2]);
        System.out.println("3.------------");
        boolean f = false;
        for (char x : bolola) {
            if (bolola[bolola.length - 1] == 'l' && bolola[bolola.length] == 'y') {
                f = true;
                System.out.println(f);
            }
        }
        System.out.println(f);
        System.out.println("4.------------");
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean t = true;
        for (int i = 0; i < bolola.length; i++) {
            if (babola[i] == 'b' && babola[i + 1] == 'b')
                break;
        }
        System.out.println(t);
        System.out.println("5.------------");
        char[] text = {' ', 'b', 'a', ' ', 'r', ' ', 'e', ' ', ' ', 'v', ' '};
        for (char x : text) {
            if (x == ' ') continue;
            System.out.print(x);
        }

    }


}
