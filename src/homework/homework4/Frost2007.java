package homework.homework4;

public class Frost2007 {
    public static void main(String[] args) {
        char[] text = {' ', ' ', ' ', ' ', 'F', 'r', 'o', 's', 't', ' ', '2', '0', '0', '7', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (endIndex > startIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char result[] = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }
}
