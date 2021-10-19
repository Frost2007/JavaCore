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
        char[] babola = {'a', 'b', 'b', 'a', 'b', 'o', 'l', 'a'};
        boolean t = false;
        for (int i = 0; i < bolola.length; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b')
                t = true;
        }
        System.out.println(t);
        System.out.println("5.------------");
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int count1 = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ')
                count1++;

        }
        char[] text2 = new char[text.length - count1];
        int count2 = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') continue;
            {
                text2[count2] = text[i];
                count2++;
            }
        }
        for (char x : text2)
            System.out.print(x);
    }

}



