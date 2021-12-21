package lesson19;

import java.io.*;

public class BRReader {
    public static void main(String[] args) throws IOException {
        char c ;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Input char, 'q' - for exit");
        do {
            c=(char) br.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
