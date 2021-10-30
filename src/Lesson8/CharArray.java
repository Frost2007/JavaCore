package Lesson8;

//Գտնել Օ սիմվոլների քանակը
public class CharArray {
    public static void main(String[] args) {
        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};


        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'c') {
                System.out.println(i);
            }// print indexes of array
            char c = 'o';
            int count = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == c) {
                    count++;
                    System.out.println("count of " + c + "=" + count);
                }
                System.out.print(charArray.length / 2 - 1);
                boolean b = false;
                if (charArray[charArray.length - 2] == 'l' && charArray[charArray.length] == 'y') {
                    b = true;
                }
                System.out.println(b);
                boolean isBob = false;
                for (int k = 0; k < charArray.length - 2; k++) {
                    if (charArray[i] == 'b' && charArray[i + 2] == 'b') {
                        isBob = true;
                        break;
                    }
                    System.out.println(isBob);

                }
            }
        }
        char[] text = {' ', ' ',' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length-1;
        while(startIndex<endIndex&& text[startIndex]==' '){
            startIndex++;
        }
        while (endIndex>startIndex&& text[endIndex]==' '){
            endIndex--;
        }

         char[] result= new char [(endIndex-startIndex)-1];
       int index=0;
        for (int i = startIndex; i <=endIndex ; i++) {
            result[index++]=text[i];
        }
        for (int i = 0; i < result.length-1 ; i++) {

        }
    }
}



