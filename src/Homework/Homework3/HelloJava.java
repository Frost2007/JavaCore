package Homework.Homework3;

public class HelloJava {
    public static void main(String[] args) {
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};
        int index = 0;
        int i = 0;
        char[] result = new char[text.length];

        for (i = 0; i < text.length; i++) {
            if (text[i] == ' ')
                continue;
            else if (text[i] != ' ') {

                break;
            }
        }
        for (int j = i; j < text.length; j++) {
            if (text[i] == ' ') {
                index++;
                result[index] = text[i];

            } else if (text[i] != ' ') {
                index++;
                result[index] = text[j];
            }
            System.out.print(result[index]);
        }



    }
}



