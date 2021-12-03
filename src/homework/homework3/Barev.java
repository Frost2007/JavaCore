package homework.homework3;

public class Barev {
    public static void main(String[] args) {
        char[] text = {' ', 'b', 'a', ' ', 'r', ' ', 'e', ' ', ' ', 'v', ' '};
        int count1 = 0;
        int n = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ')
                continue;
            else if(text[i] != ' '){
                count1++;

            }
        }
        char[] text2 = new char[text.length-count1];
        int count2 = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ')continue; {
                text2[count2] = text[i];
                count2++;
            }
        }
        for (char x : text2)
            System.out.print(x);




    }
}
