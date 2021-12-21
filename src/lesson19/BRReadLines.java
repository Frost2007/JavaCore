package lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("input lines if the text");
        System.out.println("input stop for exit");
        do {
            str = br.readLine();
        } while (!str.equals("stop"));

    }
}
