package RepeatHomeworks;

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
        System.out.println("1.--");
        System.out.println(" The count of char'o' = " + count);
        System.out.println("2.--");
        System.out.println(bolola[bolola.length / 2 - 1] + "," + bolola[bolola.length / 2]);
        System.out.println("3.--");
        boolean b = false;
        if (bolola[bolola.length - 1] == 'l' && bolola[bolola.length] == 'y') {
            b = true;
        }
        System.out.println(b);
        System.out.println("4.--");
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bolola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                b = true;
            }

        }
        System.out.println(b);
        System.out.println("5.--");
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (text[startIndex] == ' ')
            startIndex++;

        while (text[endIndex] == ' ')
            endIndex--;
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];

        }
        for (char c1 : result) {
            System.out.print(c1);

        }

    }


}
