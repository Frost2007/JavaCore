package lesson19;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        //  сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("using: ShowFile ");
            return;
        }
        //Попытка открыть файл

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Can not open the file");
            return;
        }
       // Теперь файл открыт и готов к чтению.
//        Далее из него читаются символы до тех пор,
//        пока не встретится признак конца файл
        try {
            do {
                i=fin.read();
                if (i !=-1) System.out.println((char) i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println("file reading error");
        }
        //закрыть файл
        try {
            fin.close();
        }catch (IOException e){
            System.out.println("file closing error");
        }
    }
}
