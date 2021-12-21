package homework.fileIO;

import java.io.IOException;

public class FileUtilTest {
    public static void main(String[] args) throws IOException {
        FileUtil.findLines(
                "C:\\Users\\Edgar\\Documents\\new folder\\java\\newText.txt", "Java");
        System.out.println();
        FileUtil.printSizeOfPackage(
                "C:\\Users\\Edgar\\Documents\\new folder\\java");
        System.out.println();
        FileUtil.createFileWithContent(
                "C:\\Users\\Edgar\\Documents\\new folder\\java\\TextFile.txt","TextFile.txt", "Hello from JAVA");

    }
}
