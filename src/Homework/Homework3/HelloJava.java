package Homework.Homework3;

public class HelloJava {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (text[startIndex] == ' ') {
            startIndex++;
        }
        while (text[endIndex] == ' ') {
            endIndex--;
        }
        char[] text2 = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            text2[index++] = text[i];

        }
        for (int i = 0; i < text2.length; i++) {
            System.out.print(text2[i]);
        }


    }
}




