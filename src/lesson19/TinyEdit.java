package lesson19;

import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String[] str = new String[100];
        System.out.println("input lines of the text");
        System.out.println("input stop for exit" );
        for (int i = 0; i <100 ; i++) {
            str[i]= br.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("\n content of your file"); //вывести текстовые строки
        for (int i = 0; i <100 ; i++) {
          if (str[i].equals("stop"))break;
            System.out.println(str[i]);
        }

    }

}
